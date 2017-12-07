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
package com.yan.common.constant;

/**
 * 名称：DataSourceName<br>
 * <p>
 * 描述：常量定义，枚举类型多数据源名称<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-09-06 09:43:23<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public enum DataSourceName {

    /**
     * 默认数据源<br>
     */
    DEFAULT("defaultDataSource"),

    /**
     * 扩展数据源<br>
     */
    EXTEND("extendDataSource");

    /**
     * 数据源名称<br>
     */
    private String name;

    /**
     * 构造方法<br>
     *
     * @param name 数据源名称
     */
    DataSourceName(String name) {
        this.name = name;
    }

    /**
     * 获取名称的 get 方法 <br>
     *
     * @return String 数据源真实名称
     */
    public String getName() {
        return name;
    }

}
