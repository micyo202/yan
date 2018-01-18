package com.yan.web.controller.index;

import com.yan.api.persistence.DelegateMapper;
import com.yan.core.annotation.LogInject;
import com.yan.core.annotation.MapperInject;
import com.yan.core.controller.BaseController;
import com.yan.dao.model.index.MenuModel;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 名称：MainController<br>
 * <p>
 * 描述：首页主控制器，包含一些通用的方法（模板查看、菜单加载、文件下载...）<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-09-11 09:10:21<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Controller
public class IndexController extends BaseController {

    /**
     * 日志记录<br>
     */
    @LogInject
    private static Logger log;

    /**
     * 生成delegateMapper<br>
     */
    @MapperInject
    private DelegateMapper delegateMapper;

    /**
     * 跳转到登录页<br>
     *
     * @return String 登录页路径
     */
    @RequestMapping("/login")
    public String login() {
        if (this.isNull(this.getSessionUser())) {
            return "login";
        } else {
            return "redirect:/";
        }
    }

    /**
     * 跳转错误页（包含404、500等一系列错误页）<br>
     *
     * @return String 错误页路径
     */
    @RequestMapping("/{errorCode}/error")
    public String error(@PathVariable String errorCode) {
        System.out.println(errorCode);
        return "error";
    }

    /**
     * UI模板查看<br>
     *
     * @return String 模板页面地址
     */
    @RequestMapping("/template")
    public String template() {
        return "template";
    }

    /**
     * 通用文件下载<br>
     *
     * @param fileName 文件名称（数据库中保存的名称）
     * @return ResponseEntity<byte[]> 下载的文件
     */
    @RequestMapping("/{fileName}/download")
    public ResponseEntity<byte[]> download(@PathVariable String fileName) {
        return this.fileDownLoad(fileName);
    }

    /**
     * 获取系统菜单<br>
     *
     * @return List<MenuModel> 菜单列表集合
     */
    @RequestMapping("/{roleId}/menu")
    @ResponseBody
    public List<MenuModel> menu(@PathVariable String roleId) {
        if ("admin".equals(this.getSessionUser().getUserType())) {
            // 管理员菜单（在系统 xml 中配置）
            return getMenuForXml();
        } else {
            // 一般用户菜单 general（根据角色获取对应菜单列表）
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("menuId", "00000000000000000000000000000001");
            paramMap.put("roleId", roleId);
            paramMap.put("userId", this.getSessionUser().getUserId());

            List<MenuModel> list = new ArrayList<>();
            List<MenuModel> rootList = delegateMapper.selectList("com.yan.dao.mapper.index.IndexCustomMapper.getMenu", paramMap);
            for (MenuModel menuModel : rootList) {
                menuModel.setChildren(getMenu(menuModel.getId(), roleId));
                list.add(menuModel);
            }
            return list;
        }
    }

    /**
     * 递归获取所有菜单信息<br>
     *
     * @param pid 菜单父ID
     * @return List<MenuModel> 菜单列表集合
     */
    private List<MenuModel> getMenu(String pid, String roleId) {

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("menuId", pid);
        paramMap.put("roleId", roleId);
        paramMap.put("userId", this.getSessionUser().getUserId());

        List<MenuModel> list = new ArrayList<>();
        List<MenuModel> menuList = delegateMapper.selectList("com.yan.dao.mapper.index.IndexCustomMapper.getMenu", paramMap);
        for (MenuModel menuModel : menuList) {
            if (!this.isNull(menuModel.getId())) {
                menuModel.setChildren(getMenu(menuModel.getId(), roleId));
            }
            list.add(menuModel);
        }
        return list;
    }

    /**
     * 从 xml 中读取管理员菜单（adminMenu.xml）<br>
     *
     * @return List<MenuModel> 菜单列表集合
     */
    @SuppressWarnings("unchecked")
    private List<MenuModel> getMenuForXml() {
        List<MenuModel> list = new ArrayList<>();
        try {
            // 获取需要读取的xml文件路径
            InputStream inputStream = this.getClass().getResourceAsStream("/adminMenu.xml");
            // 创建SAXReader的对象reader
            SAXReader reader = new SAXReader();
            // 通过reader对象的read方法加载adminMenu.xml文件,获取docuemnt对象。
            Document document = reader.read(inputStream);
            // 通过document对象获取根节点element
            Element element = document.getRootElement();
            List<Element> menus = element.elements();
            for (Element menu : menus) {
                MenuModel menuModelParent = new MenuModel();
                List<MenuModel> childList = new ArrayList<>();
                menuModelParent.setName(menu.attributeValue("name"));
                menuModelParent.setIcon(this.isNull(menu.attributeValue("icon")) ? "zmdi zmdi-apps" : menu.attributeValue("icon"));
                List<Element> menuItems = menu.elements();
                for (Element menuItem : menuItems) {
                    MenuModel menuModelChild = new MenuModel();
                    menuModelChild.setName(menuItem.elementText("name"));
                    menuModelChild.setUrl(menuItem.elementText("url"));
                    childList.add(menuModelChild);
                }
                menuModelParent.setChildren(childList);
                list.add(menuModelParent);
            }
        } catch (Exception e) {
            log.error("读取 xml 菜单信息失败");
            e.printStackTrace();
        }
        return list;
    }
}
