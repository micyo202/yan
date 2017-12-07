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
package com.yan.core.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 名称：ShiroRealm<br>
 *
 * 描述：域 realm 实现类<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-09-14 13:16:45<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public class ShiroRealm extends AuthorizingRealm {

	/**
	 * 为当前登录的Subject授予角色和权限
	 * 
	 * 该方法的调用时机为需授权资源被访问时 每次访问需授权资源时都会执行该方法中的逻辑,如果用户授权内容被缓存，则在不会重复调用该方法
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		/*
		 * SimpleAuthorizationInfo authorizationInfo = new
		 * SimpleAuthorizationInfo();
		 * 
		 * String username = (String) principals.getPrimaryPrincipal();
		 * System.out.println("---------------username" + username); Set<String>
		 * roles = new HashSet<String>(); roles.add("administrator");// 添加角色 //
		 * Set<String> roles = mapper.selectByRoles(username);
		 * authorizationInfo.setRoles(roles);
		 * 
		 * Set<String> permissions = new HashSet<String>();
		 * permissions.add("admin"); // 添加权限 // Set<String> permissions =
		 * mapper.selectByPermissions(username);
		 * authorizationInfo.setStringPermissions(permissions);
		 * 
		 * return authorizationInfo;
		 */
		return null;
	}

	/**
	 * 验证当前登录的Subject 在subject.login(AuthenticationToken)时调用该方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 获取基于用户名和密码的令牌
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
		// 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(usernamePasswordToken.getUsername(),
				usernamePasswordToken.getPassword(), getName());
		clearCache(authenticationInfo.getPrincipals());// 认证成功清除之前缓存
		return authenticationInfo;
	}
	
}
