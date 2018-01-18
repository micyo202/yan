package com.yan.dao.model.menu;

import java.io.Serializable;
import java.util.List;

/**
 * 名称：MenuNode<br>
 *
 * 描述：菜单模型<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-09-09 12:11:40<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public class MenuNode implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 菜单主键<br>
	 */
	private String id;
	
	/**
	 * 菜单父ID<br>
	 */
	private String pid;
	
	/**
	 * 菜单名称<br>
	 */
	private String name;
	
	/**
	 * 菜单url地址（用href替换url防止点击自动跳转）<br>
	 */
	private String href;
	
	/**
	 * 菜单级别<br>
	 */
	private Integer level;
	
	/**
	 * 是否父级菜单（若是父级菜单则图标显示文件夹，否则显示文件）<br>
	 */
	private Boolean isParent;
	
	/**
	 * 不显示某个节点的 checkbox / radio <br>
	 */
	private Boolean nocheck;
	
	/**
	 * 是否展开菜单<br>
	 */
	private Boolean open;
	
	/**
	 * 是否选中 <br>
	 */
	private Boolean checked;
	
	/**
	 * 有效值<br>
	 */
	private Boolean valid;
	
	/**
	 * 子菜单集合<br>
	 */
	private List<MenuNode> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Boolean getIsParent() {
		return isParent;
	}

	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	public Boolean getNocheck() {
		return nocheck;
	}

	public void setNocheck(Boolean nocheck) {
		this.nocheck = nocheck;
	}

	public Boolean getOpen() {
		return open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public List<MenuNode> getChildren() {
		return children;
	}

	public void setChildren(List<MenuNode> children) {
		this.children = children;
	}
	
}
