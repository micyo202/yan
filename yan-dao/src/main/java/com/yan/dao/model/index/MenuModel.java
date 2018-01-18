package com.yan.dao.model.index;

import java.io.Serializable;
import java.util.List;

/**
 * 名称：MenuModel<br>
 * <p>
 * 描述：菜单模型（左侧菜单结构）<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-09-07 15:39:03<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public class MenuModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单主键<br>
     */
    private String id;

    /**
     * 菜单名称<br>
     */
    private String name;

    /**
     * 菜单图标<br>
     */
    private String icon;

    /**
     * 菜单链接地址<br>
     */
    private String url;

    /**
     * 子菜单集合<br>
     */
    private List<MenuModel> children;

    /**
     * 获取菜单主键<br>
     *
     * @return String 菜单主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置菜单主键<br>
     *
     * @param id 菜单主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取菜单名称<br>
     *
     * @return String 菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜单名称<br>
     *
     * @param name 菜单名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取菜单图标<br>
     *
     * @return String 菜单图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置菜单图标<br>
     *
     * @param icon 菜单图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取菜单url地址<br>
     *
     * @return String 菜单url地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置菜单url地址<br>
     *
     * @param url 菜单地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取子菜单集合<br>
     *
     * @return List<MenuModel> 子菜单集合
     */
    public List<MenuModel> getChildren() {
        return children;
    }

    /**
     * 设置子菜单集合<br>
     *
     * @param children 子菜单集合
     */
    public void setChildren(List<MenuModel> children) {
        this.children = children;
    }

}
