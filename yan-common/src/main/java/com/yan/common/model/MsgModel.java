/*
 * Copyright (c) 2017 Yanzheng [https://github.com/micyo202/yan]
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.yan.common.model;

import java.io.Serializable;

/**
 * 名称：MsgModel<br>
 * <p>
 * 描述：消息模型<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-09-07 15:44:59<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public class MsgModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态值<br>
     */
    private String status;

    /**
     * 消息<br>
     */
    private String msg;

    /**
     * 返回对象<br>
     */
    private Object res;

    /**
     * 获取状态值<br>
     *
     * @return String 状态值
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态值<br>
     *
     * @param status 状态值
     */
    public void setStatus(String status) {
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
     * 获取结果对象<br>
     *
     * @return Object 结果对象
     */
    public Object getRes() {
        return res;
    }

    /**
     * 设置结果对象<br>
     *
     * @param res 结果对象
     */
    public void setRes(Object res) {
        this.res = res;
    }

    /**
     * 无参构造方法，构建 MsgModel 对象<br>
     */
    public MsgModel() {
        super();
    }

    /**
     * 代参构造方法，构建 MsgModel 对象<br>
     *
     * @param status 状态值
     * @param msg    消息内容
     * @param res    结果对象
     */
    public MsgModel(String status, String msg, Object res) {
        super();
        this.status = status;
        this.msg = msg;
        this.res = res;
    }

    /**
     * 代参构造方法，构建 MsgModel 对象<br>
     *
     * @param status 状态值
     * @param msg    消息内容
     */
    public MsgModel(String status, String msg) {
        super();
        this.status = status;
        this.msg = msg;
    }

    /**
     * 代参构造方法，构建 MsgModel 对象<br>
     *
     * @param msg 消息内容
     */
    public MsgModel(String msg) {
        super();
        this.msg = msg;
    }

}