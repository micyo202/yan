package com.yan.web.controller.role;

import com.yan.dao.mapper.role.RoleMenuRelMapper;
import com.yan.dao.mapper.role.SysRoleMapper;
import com.yan.api.persistence.DelegateMapper;
import com.yan.common.model.MsgModel;
import com.yan.core.annotation.MapperInject;
import com.yan.core.controller.BaseController;
import com.yan.dao.model.role.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 名称：RoleController<br>
 * <p>
 * 描述：角色管理模块<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-09-21 10:00:57<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Controller
@RequestMapping("/common/role")
public class RoleController extends BaseController {

    private static final String NAMESPACE = "com.yan.dao.mapper.role.SysRoleCustomMapper";

    @MapperInject
    private DelegateMapper delegateMapper;

    @MapperInject(SysRoleMapper.class)
    private SysRoleMapper mapper;

    @RequestMapping("/manage")
    public String manage() {
        return "common/role/manage";
    }

    /**
     * 获取角色 tree 结构<br>
     *
     * @param id 父Id
     * @return List<RoleNode> 角色节点列表集合
     */
    @RequestMapping(value = "/roleTree", method = RequestMethod.POST)
    @ResponseBody
    public List<RoleNode> getRoleTree(String id) {

        if (this.isNull(id)) {
            id = "00000000000000000000000000000000";
        }

        List<RoleNode> nodeList = new ArrayList<>();
        List<RoleNode> rootList = delegateMapper.selectList(NAMESPACE + ".getRoleNode", id);
        for (RoleNode roleNode : rootList) {
            roleNode.setChildren(getRoleNode(roleNode.getId()));
            nodeList.add(roleNode);
        }
        return nodeList;
    }

    /**
     * 获取 checkbox 形式的 tree 结构（为用户管理提供支持）<br>
     *
     * @param userId 用户Id
     * @param id     父Id
     * @return List<RoleNode> 角色节点列表集合
     */
    @RequestMapping(value = "/roleCheckedTree", method = RequestMethod.POST)
    @ResponseBody
    public List<RoleNode> getRoleCheckedTree(String userId, String id) {

        if (this.isNull(id)) {
            id = "00000000000000000000000000000000";
        }

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("userId", userId);
        paramMap.put("roleId", id);

        List<RoleNode> nodeList = new ArrayList<>();
        List<RoleNode> rootList = delegateMapper.selectList(NAMESPACE + ".getRoleCheckedNode", paramMap);
        for (RoleNode roleNode : rootList) {
            roleNode.setChildren(getRoleCheckedNode(userId, roleNode.getId()));
            nodeList.add(roleNode);
        }
        return nodeList;
    }

    /**
     * 添加角色<br>
     *
     * @param roleId 角色上级节点Id
     * @param model  页面传递模型信息
     * @return String 添加页地址
     */
    @RequestMapping("/{roleId}/add")
    public String add(@PathVariable String roleId, Model model) {
        SysRole pRole = mapper.selectByPrimaryKey(roleId);
        SysRole role = new SysRole();
        role.setRolePid(pRole.getRoleId());
        role.setRoleLevel(pRole.getRoleLevel() + 1);
        role.setRoleType("group");
        role.setRoleValid(pRole.getRoleValid());
        model.addAttribute("role", role);
        return "common/role/addOrEdit";
    }

    /**
     * 编辑角色<br>
     *
     * @param roleId 角色Id
     * @param model  页面传递模型信息
     * @return String 编辑页面地址
     */
    @RequestMapping("/{roleId}/edit")
    public String edit(@PathVariable String roleId, Model model) {
        SysRole role = mapper.selectByPrimaryKey(roleId);
        model.addAttribute("role", role);
        return "common/role/addOrEdit";
    }

    /**
     * 角色保存方法<br>
     *
     * @param role 角色信息
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public MsgModel save(SysRole role) {
        String status = "0";// 状态值，0：刷新本级树，1：刷新父级树
        if (this.isNull(role.getRoleId())) {
            // 添加操作
            role.setRoleId(this.getUUID());
            mapper.insertSelective(role);
        } else {
            // 修改操作
            mapper.updateByPrimaryKeySelective(role);
            status = "1";
        }
        return this.resultMsg(status, "保存成功！");
    }

    /**
     * 角色删除方法<br>
     *
     * @param roleId  角色Id
     * @param rolePid 角色父Id
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MsgModel delete(String roleId, String rolePid) {
        SysRoleExample example = new SysRoleExample();
        example.createCriteria().andRolePidEqualTo(roleId);
        mapper.deleteByExample(example);// 删除子级数据
        mapper.deleteByPrimaryKey(roleId);// 删除当前数据
        return this.resultMsg("0", "删除成功！");
    }

    /**
     * 角色对应菜单保存<br>
     *
     * @param roleId  角色Id
     * @param menuStr 菜单列表字符串
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/menuSave", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public MsgModel menuSave(String roleId, String menuStr) {
        List<String> menuIds = Arrays.asList(menuStr.split(","));
        RoleMenuRelMapper mapper = this.getMapper(RoleMenuRelMapper.class);
        // 先清除历史数据
        RoleMenuRelExample example = new RoleMenuRelExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        mapper.deleteByExample(example);

        // 添加
        for (String menuId : menuIds) {
            if (!this.isNull(menuId.trim())) {
                RoleMenuRel roleMenuRel = new RoleMenuRel();
                roleMenuRel.setRelId(this.getUUID());
                roleMenuRel.setRoleId(roleId);
                roleMenuRel.setMenuId(menuId);
                mapper.insertSelective(roleMenuRel);
            }
        }
        return this.resultMsg("资源保存成功！");
    }

    /**
     * 角色 tree 结构加载<br>
     *
     * @param pid 父Id
     * @return List<RoleNode> 角色节点列表集合
     */
    private List<RoleNode> getRoleNode(String pid) {
        List<RoleNode> roleList = delegateMapper.selectList(NAMESPACE + ".getRoleNode", pid);
        return roleList;
    }

    /**
     * 角色 checkbox 形式 tree 加载（为用户管理提供支持）<br>
     *
     * @param userId 用户Id
     * @param pid    父Id
     * @return List<RoleNode> 角色节点列表集合
     */
    private List<RoleNode> getRoleCheckedNode(String userId, String pid) {

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("userId", userId);
        paramMap.put("roleId", pid);

        List<RoleNode> roleList = delegateMapper.selectList(NAMESPACE + ".getRoleCheckedNode", paramMap);
        return roleList;
    }

}
