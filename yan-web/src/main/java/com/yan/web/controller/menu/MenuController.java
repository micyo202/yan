package com.yan.web.controller.menu;

import com.yan.dao.mapper.menu.SysMenuMapper;
import com.yan.api.persistence.DelegateMapper;
import com.yan.common.model.MsgModel;
import com.yan.core.annotation.MapperInject;
import com.yan.core.controller.BaseController;
import com.yan.dao.model.menu.MenuNode;
import com.yan.dao.model.menu.SysMenu;
import com.yan.dao.model.menu.SysMenuExample;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 名称：MenuController<br>
 * <p>
 * 描述：菜单资源管理（ztree结构管理）<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-08-30 11:25:20<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Controller
@RequestMapping("/common/menu")
public class MenuController extends BaseController {

    private static final String NAMESPACE = "com.yan.dao.mapper.menu.SysMenuCustomMapper";

    /**
     * 使用注解获取 delegateMapper 对象
     */
    @MapperInject
    private DelegateMapper delegateMapper;

    /**
     * 使用注解获取指定对象的 mapper 映射
     */
    @MapperInject(SysMenuMapper.class)
    private SysMenuMapper mapper;

    /**
     * 菜单管理初始化<br>
     *
     * @return String 菜单管理初始化页面
     */
    @RequestMapping("/manage")
    public String manage() {
        return "common/menu/manage";
    }

    /**
     * 菜单管理树结构（异步加载）<br>
     *
     * @param id 菜单主键
     * @return List<MenuNode> 菜单集合
     */
    @RequestMapping(value = "/menuTree", method = RequestMethod.POST)
    @ResponseBody
    public List<MenuNode> getMenuTree(String id) {
        if (this.isNull(id)) {
            id = "00000000000000000000000000000000";
        }
        List<MenuNode> nodeList = new ArrayList<>();
        List<MenuNode> rootList = delegateMapper.selectList(NAMESPACE + ".getMenuNode", id);
        for (MenuNode menuNode : rootList) {
            menuNode.setChildren(getMenuNode(menuNode.getId()));
            nodeList.add(menuNode);
        }
        return nodeList;
    }

    /**
     * 获取 checkbox 形式的树结构，并获取已选中项（为角色管理提供支持）<br>
     *
     * @param roleId 角色Id
     * @param id     树父Id
     * @return List<MenuNode> 树结构结果集
     */
    @RequestMapping(value = "/menuCheckedTree", method = RequestMethod.POST)
    @ResponseBody
    public List<MenuNode> getMenuCheckedTree(String roleId, String id) {

        if (this.isNull(id)) {
            id = "00000000000000000000000000000000";
        }

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("roleId", roleId);
        paramMap.put("menuId", id);

        List<MenuNode> nodeList = new ArrayList<>();
        List<MenuNode> rootList = delegateMapper.selectList(NAMESPACE + ".getMenuCheckedNode", paramMap);
        for (MenuNode menuNode : rootList) {
            menuNode.setChildren(getMenuCheckedNode(roleId, menuNode.getId()));
            nodeList.add(menuNode);
        }
        return nodeList;
    }

    /**
     * 添加菜单节点<br>
     *
     * @param menuId 菜单父节点ID
     * @param model  菜单模型数据
     * @return String 添加菜单页面
     */
    @RequestMapping("/{menuId}/add")
    public String add(@PathVariable String menuId, Model model) {
        SysMenu pMenu = mapper.selectByPrimaryKey(menuId);
        SysMenu menu = new SysMenu();
        menu.setMenuPid(pMenu.getMenuId());
        menu.setMenuLevel(pMenu.getMenuLevel() + 1);
        menu.setMenuValid(pMenu.getMenuValid());
        model.addAttribute("menu", menu);
        return "common/menu/addOrEdit";
    }

    /**
     * 编辑菜单<br>
     *
     * @param menuId 菜单主键
     * @param model  编辑菜单对应的模型数据
     * @return String 菜单编辑界面
     */
    @RequestMapping("/{menuId}/edit")
    public String edit(@PathVariable String menuId, Model model) {
        SysMenu menu = mapper.selectByPrimaryKey(menuId);
        model.addAttribute("menu", menu);
        return "common/menu/addOrEdit";
    }

    /**
     * 保存菜单<br>
     *
     * @param menu 菜单模型数据
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MsgModel save(SysMenu menu) {
        String status = "0";// 状态值，0：刷新本级树，1：刷新父级树
        if (this.isNull(menu.getMenuId())) {
            // 添加操作
            menu.setMenuId(this.getUUID());
            menu.setMenuType("menu");
            mapper.insertSelective(menu);
            SysMenu pMenu = mapper.selectByPrimaryKey(menu.getMenuPid());
            if ("menu".equals(pMenu.getMenuType())) {
                // 修改父节点为 folder
                Map<String, Object> map = new HashMap<>();
                map.put("menuType", "folder");
                map.put("menuId", menu.getMenuPid());
                delegateMapper.update(NAMESPACE + ".updateMenuType", map);
                status = "1";
            }
        } else {
            // 修改操作
            mapper.updateByPrimaryKeySelective(menu);
            status = "1";
        }
        return this.resultMsg(status, "保存成功！");
    }

    /**
     * 删除菜单<br>
     *
     * @param menuId  菜单主键
     * @param menuPid 菜单父ID
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MsgModel delete(String menuId, String menuPid) {
        String status = "0";
        SysMenuExample example = new SysMenuExample();
        example.createCriteria().andMenuPidEqualTo(menuId);
        mapper.deleteByExample(example);// 删除子级数据
        mapper.deleteByPrimaryKey(menuId);// 删除当前数据
        // 如果父节点下没有子菜单，则修父节点改类型为 menu
        SysMenuExample pExample = new SysMenuExample();
        pExample.createCriteria().andMenuPidEqualTo(menuPid);
        List<SysMenu> list = mapper.selectByExample(pExample);
        if (this.isNull(list)) {
            // 修改父节点为 menu
            Map<String, Object> map = new HashMap<>();
            map.put("menuType", "menu");
            map.put("menuId", menuPid);
            delegateMapper.update(NAMESPACE + ".updateMenuType", map);
            status = "1";
        }
        return this.resultMsg(status, "删除成功！");
    }

    /**
     * 菜单 tree 结构加载<br>
     *
     * @param pid 菜单父ID
     * @return List<MenuNode> 菜单节点集合
     */
    private List<MenuNode> getMenuNode(String pid) {
        List<MenuNode> menuList = delegateMapper.selectList(NAMESPACE + ".getMenuNode", pid);
        return menuList;
    }

    /**
     * 菜单 checkbox 结构 tree 加载（为角色管理提供支持）<br>
     *
     * @param roleId 角色Id
     * @param pid    父Id
     * @return List<MenuNode> 菜单节点集合
     */
    private List<MenuNode> getMenuCheckedNode(String roleId, String pid) {

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("roleId", roleId);
        paramMap.put("menuId", pid);

        List<MenuNode> menuList = delegateMapper.selectList(NAMESPACE + ".getMenuCheckedNode", paramMap);
        return menuList;
    }

}