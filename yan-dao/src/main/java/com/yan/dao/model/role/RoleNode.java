package com.yan.dao.model.role;

import java.io.Serializable;
import java.util.List;

public class RoleNode implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String pid;
	private String name;
	private Integer level;

	private Boolean isParent;
	private Boolean nocheck;
	private Boolean open;
	private Boolean checked;
	private Boolean valid;

	private List<RoleNode> children;

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

	public List<RoleNode> getChildren() {
		return children;
	}

	public void setChildren(List<RoleNode> children) {
		this.children = children;
	}

}
