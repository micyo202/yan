package com.yan.dao.model.login;

import java.io.Serializable;

/**
 * 名称：LoginModel<br>
 *
 * 描述：登录模型<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-08-22 10:52:18<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public class LoginModel implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 状态值，0：失败，1：成功<br>
	 */
	private int status;
	
	/**
	 * 消息<br>
	 */
	private String msg;
	
	/**
	 * 跳转url<br>
	 */
	private String url;
	
	/**
	 * 记住我（记住密码）<br>
	 */
	private boolean remember;

	/**
	 * 获取状态值<br>
	 *
	 * @return int 状态值
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * 设置状态值<br>
	 *
	 * @param status 状态值
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * 获取消息<br>
	 *
	 * @return String 消息内容
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * 设置消息<br>
	 *
	 * @param msg 消息内容
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * 获取跳转的url地址<br>
	 *
	 * @return String url地址
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置跳转的url地址<br>
	 *
	 * @param url 地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取记住我（记住密码）值<br>
	 *
	 * @return boolean 是否记住我
	 */
	public boolean isRemember() {
		return remember;
	}

	/**
	 * 设置记住我（记住密码）值<br>
	 *
	 * @param remember 是否记住我
	 */
	public void setRemember(boolean remember) {
		this.remember = remember;
	}

	public LoginModel(int status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}

	public LoginModel(int status, String url, boolean remember) {
		super();
		this.status = status;
		this.url = url;
		this.remember = remember;
	}
	
}
