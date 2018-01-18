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
package com.yan.core.controller;

import com.yan.dao.model.login.LoginUser;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.InvalidSessionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 名称：BaseController<br>
 * <p>
 * 描述：基本的控制器，继承于父类ControllerSupport，
 * 该类提供设置与获取session、request、response的方法，父类提供一系列支持方法，
 * 自定义业务层controller需继承该类方可使用已封装好的方法。（方法详细见参考信息）<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-08-02 14:15:18<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 * @see ControllerSupport
 */
public abstract class BaseController extends ControllerSupport {

    /**
     * 服务器会话信息 session 对象<br>
     */
    @Autowired
    private HttpSession session;
    /**
     * 用户请求 request 对象<br>
     */
    @Autowired
    private HttpServletRequest request;
    /**
     * 服务器响应结果 response 对象<br>
     */
    @Autowired
    private HttpServletResponse response;

    /**
     * 获取服务器会话 session 对象<br>
     *
     * @return HttpSession 服务器会话
     */
    protected HttpSession getSession() {
        return session;
    }

    /**
     * 设置服务器会话 session 对象<br>
     *
     * @param session 服务器会话
     */
    protected void setSession(HttpSession session) {
        this.session = session;
    }

    /**
     * 获取用户请求 request 对象<br>
     *
     * @return HttpServletRequest 用户请求
     */
    protected HttpServletRequest getRequest() {
        return request;
    }

    /**
     * 设置用户请求 request 对象<br>
     *
     * @param request 用户请求
     */
    protected void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    /**
     * 获取服务器响应结果 response 对象<br>
     *
     * @return HttpServletResponse 服务器响应结果
     */
    protected HttpServletResponse getResponse() {
        return response;
    }

    /**
     * 设置服务器响应结果 response 对象<br>
     *
     * @param response 服务器响应结果
     */
    protected void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    /**
     * 获取登录成功后 session 中的存储的用户信息<br>
     *
     * @return LoginUser 用户对象
     */
    protected LoginUser getSessionUser() {
        return (LoginUser) this.session.getAttribute("user");
    }

    /**
     * 统一异常处理类
     *
     * @param request
     * @param response
     * @param exception
     * @return String
     */
    @ExceptionHandler
    protected String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
        // 统一异常处理类
        request.setAttribute("ex", exception);
        if (null != request.getHeader("X-Requested-With") && request.getHeader("X-Requested-With").equalsIgnoreCase("XMLHttpRequest")) {
            request.setAttribute("requestHeader", "ajax");
        }
        // shiro 没有权限异常
        if (exception instanceof UnauthorizedException) {
            return "/403/error";
        }
        // shiro 会话已过期异常
        if (exception instanceof InvalidSessionException) {
            return "/login";
        }
        return "/500/error";
    }

}
