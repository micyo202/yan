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
package com.yan.core.spring;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 名称：DataSourceContextHolder<br>
 *
 * 描述：动态切换数据源支持器<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-08-10 16:17:11<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public class DataSourceContextHolder extends AbstractRoutingDataSource {

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

	/**
	 * 抽象方法查找数据源标示<br>
	 *
	 * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#determineCurrentLookupKey()
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		return getDataSource();
	}

	/**
	 * 设置数据源名称<br>
	 *
	 * @param dataSource 数据源名称
	 */
	public static void setDataSource(String dataSource) {
		contextHolder.set(dataSource);
	}

	/**
	 * 获取数据源<br>
	 *
	 * @return String 数据源名称
	 */
	public static String getDataSource() {
		return ((String) contextHolder.get());
	}

	/**
	 * 清理数据源（恢复默认数据源）<br>
	 */
	public static void clearDataSource() {
		contextHolder.remove();
	}

}
