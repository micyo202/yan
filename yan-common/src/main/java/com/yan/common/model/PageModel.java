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

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 名称：PageModel<br>
 * <p>
 * 描述：自定义封装好的分页Page对象，与页面 boostrapTable 插件交互使用<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-08-03 16:16:27<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public class PageModel<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 总记录数<br>
     */
    private long total;

    /**
     * 结果集<br>
     */
    private List<T> rows;

    /**
     * 页码值<br>
     */
    private int pageNum;

    /**
     * 每页记录数<br>
     */
    private int pageSize;

    /**
     * 总页数<br>
     */
    private int pages;

    /**
     * 当前页的数量 <= pageSize，该属性来自ArrayList的size属性<br>
     */
    private int size;

    /**
     * 无参构造方法，构建 PageModel 对象<br>
     */
    public PageModel() {
        super();
    }

    /**
     * 构造方法（根据参数 List 创建 PageModel）<br>
     *
     * @param list 分页查询出的 Page 集合
     */
    public PageModel(List<T> list) {
        if (list instanceof Page) {
            Page<T> page = (Page<T>) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.total = page.getTotal();
            this.pages = page.getPages();
            List<T> customList = new ArrayList<>();
            for (T t : list) {
                customList.add(t);
            }
            this.rows = customList;
            this.size = page.size();
        }
    }

    /**
     * 获取总记录数<br>
     *
     * @return long 总记录数
     */
    public long getTotal() {
        return total;
    }

    /**
     * 设置总记录数<br>
     *
     * @param total 总记录数
     */
    public void setTotal(long total) {
        this.total = total;
    }

    /**
     * 获取数据集合<br>
     *
     * @return List<T> 结果数据集合
     */
    public List<T> getRows() {
        return rows;
    }

    /**
     * 设置数据结合（使用 forEach 遍历集合转换对象）<br>
     *
     * @param rows 结果对象集合
     */
    public void setRows(List<T> rows) {
        List<T> list = new ArrayList<>();
        for (T t : rows) {
            list.add(t);
        }
        this.rows = list;
    }

    /**
     * 获取当前页码值<br>
     *
     * @return int 当前页码值
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * 设置当前页码值<br>
     *
     * @param pageNum 当前页码值
     */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * 获取每页记录数<br>
     *
     * @return int 每页记录数
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置每页记录数<br>
     *
     * @param pageSize 每页记录数
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获取总页数<br>
     *
     * @return int 总页数
     */
    public int getPages() {
        return pages;
    }

    /**
     * 设置总页数<br>
     *
     * @param pages 总页数
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * 获取当前页数量<br>
     *
     * @return int 当前页条数
     */
    public int getSize() {
        return size;
    }

    /**
     * 设置当前页数量<br>
     *
     * @param size 当前页条数
     */
    public void setSize(int size) {
        this.size = size;
    }

}