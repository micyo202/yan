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
package com.yan.service.persistence;

import com.github.pagehelper.PageHelper;
import com.yan.api.persistence.DelegateMapper;
import com.yan.common.model.PageModel;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * 名称：DelegateMapperImpl<br>
 * <p>
 * 描述：自定义的代理Mapper实现类，封装了常用CRUD操作<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-08-20 10:12:38<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public class DelegateMapperImpl implements DelegateMapper {

    /**
     * mybatis 中的 sqlSessionTemplate 对象，在 spring 配置文件中<br>
     */
    private SqlSessionTemplate sqlSessionTemplate;

    /**
     * 构造方法<br>
     *
     * @param sqlSessionTemplate 是 mybatis 中的 sqlSessionTemplate 对象
     */
    public DelegateMapperImpl(SqlSessionTemplate sqlSessionTemplate) {
        super();
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    /**
     * 无参查询单个对象<br>
     *
     * @param statement 对应 sqlMapper 模板中的单个对象查询 sql 语句的映射名
     * @return T 查询的对象
     */
    public <T> T selectOne(String statement) {
        return this.sqlSessionTemplate.selectOne(statement);
    }

    /**
     * 带参查询单个对象<br>
     *
     * @param statement 对应 sqlMapper 模板中的单个对象查询 sql 语句的映射名
     * @param parameter 查询单个对象所需的参数
     * @return T 查询的对象
     */
    public <T> T selectOne(String statement, Object parameter) {
        return this.sqlSessionTemplate.selectOne(statement, parameter);
    }

    /**
     * 无参查询对象集合<br>
     *
     * @param statement 对应 sqlMapper 模板中的集合查询 sql 语句的映射名
     * @return List<T> 查询的对象结果集
     */
    public <T> List<T> selectList(String statement) {
        return this.sqlSessionTemplate.selectList(statement);
    }

    /**
     * 带参查询对象集合<br>
     *
     * @param statement 对应 sqlMapper 模板中的集合查询 sql 语句的映射名
     * @param parameter 查询所需的参数
     * @return List<T> 查询的对象结果集
     */
    public <T> List<T> selectList(String statement, Object parameter) {
        return this.sqlSessionTemplate.selectList(statement, parameter);
    }

    /**
     * 带参查询对象集合（并带有条数范围）<br>
     *
     * @param statement 对应 sqlMapper 模板中的集合查询 sql 语句的映射名
     * @param parameter 查询所需的参数
     * @param rowBounds 查询条数范围（条数范围）
     * @return List<T> 查询的对象结果集
     */
    public <T> List<T> selectList(String statement, Object parameter, RowBounds rowBounds) {
        return this.sqlSessionTemplate.selectList(statement, parameter, rowBounds);
    }

    /**
     * 分页查询，返回 Page 分页对象<br>
     *
     * @param statement 对应 sqlMapper 模板中的分页查询 sql 语句的映射名
     * @param offset    分页起始数量
     * @param limit     分页限制条数
     * @return PageModel<T> 分页结果集，自定义的 PageModel 模型
     */
    public <T> PageModel<T> selectPagination(String statement, int offset, int limit) {
        return new PageModel<>(PageHelper.offsetPage(offset, limit).doSelectPage(() -> this.sqlSessionTemplate.selectList(statement)));
    }

    /**
     * 带参分页查询，返回 Page 分页对象<br>
     *
     * @param statement 对应 sqlMapper 模板中的分页查询 sql 语句的映射名
     * @param parameter 分页查询所需的参数
     * @param offset    分页起始数量
     * @param limit     分页限制条数
     * @return PageModel<T> 分页结果集，自定义的 PageModel 模型
     */
    public <T> PageModel<T> selectPagination(String statement, Object parameter, int offset, int limit) {
        return new PageModel<>(PageHelper.offsetPage(offset, limit).doSelectPage(() -> this.sqlSessionTemplate.selectList(statement, parameter)));
    }

    /**
     * 无参增加方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的增加 sql 语句的映射名
     * @return int 增加成功的条数
     */
    public int insert(String statement) {
        return this.sqlSessionTemplate.insert(statement);
    }

    /**
     * 带参增加方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的增加 sql 语句的映射名
     * @param parameter 增加数据所需的参数
     * @return int 增加成功的条数
     */
    public int insert(String statement, Object parameter) {
        return this.sqlSessionTemplate.insert(statement, parameter);
    }

    /**
     * 无参修改方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的修改 sql 语句的映射名
     * @return int 修改成功的条数
     */
    public int update(String statement) {
        return this.sqlSessionTemplate.update(statement);
    }

    /**
     * 带参修改方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的修改 sql 语句的映射名
     * @param parameter 修改数据所需的参数
     * @return int 修改成功的条数
     */
    public int update(String statement, Object parameter) {
        return this.sqlSessionTemplate.update(statement, parameter);
    }

    /**
     * 无参删除方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的删除 sql 语句的映射名
     * @return int 删除成功的条数
     */
    public int delete(String statement) {
        return this.sqlSessionTemplate.delete(statement);
    }

    /**
     * 带参删除方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的删除 sql 语句的映射名
     * @param parameter 删除数据所需的参数
     * @return int 删除成功的条数
     */
    public int delete(String statement, Object parameter) {
        return this.sqlSessionTemplate.delete(statement, parameter);
    }

}
