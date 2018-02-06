package com.yan.common.service;

import com.yan.common.model.PageModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 描述：通用base接口，封装CRUD操作<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018/1/24 下午4:49<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public interface BaseService<Record, Example> {

    /**
     * 根据条件查询记录数量
     *
     * @param example
     * @return
     */
    int countByExample(Example example);

    /**
     * 根据条件删除记录
     *
     * @param example
     * @return
     */
    int deleteByExample(Example example);

    /**
     * 根据主键删除记录
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 插入记录
     *
     * @param record
     * @return
     */
    int insert(Record record);

    /**
     * 插入记录有效字段
     *
     * @param record
     * @return
     */
    int insertSelective(Record record);

    /**
     * 根据条件查询记录，附带BLOB字段
     *
     * @param example
     * @return
     */
    List<Record> selectByExampleWithBLOBs(Example example);

    /**
     * 根据条件查询记录
     *
     * @param example
     * @return
     */
    List<Record> selectByExample(Example example);

    /**
     * 根据条件查询记录并按页码分页，附带BLOB字段
     *
     * @param example  条件
     * @param pageNum  页数
     * @param pageSize 每页记录数
     * @return
     */
    PageModel<Record> selectByExampleWithBLOBsForStartPage(Example example, Integer pageNum, Integer pageSize);

    /**
     * 根据条件查询记录并按页码分页
     *
     * @param example  条件
     * @param pageNum  页数
     * @param pageSize 每页记录数
     * @return
     */
    PageModel<Record> selectByExampleForStartPage(Example example, Integer pageNum, Integer pageSize);

    /**
     * 根据条件查询记录并按最后记录数分页，附带BLOB字段
     *
     * @param example 条件
     * @param offset  跳过数量
     * @param limit   查询数量
     * @return
     */
    PageModel<Record> selectByExampleWithBLOBsForOffsetPage(Example example, Integer offset, Integer limit);

    /**
     * 根据条件查询记录并按最后记录数分页
     *
     * @param example 条件
     * @param offset  跳过数量
     * @param limit   查询数量
     * @return
     */
    PageModel<Record> selectByExampleForOffsetPage(Example example, Integer offset, Integer limit);

    /**
     * 根据条件查询第一条记录
     *
     * @param example
     * @return
     */
    Record selectFirstByExample(Example example);

    /**
     * 根据条件查询第一条记录，附带BLOB字段
     *
     * @param example
     * @return
     */
    Record selectFirstByExampleWithBLOBs(Example example);

    /**
     * 根据主键查询记录
     *
     * @param id
     * @return
     */
    Record selectByPrimaryKey(String id);

    /**
     * 根据条件更新有效字段
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example);

    /**
     * 根据条件更新记录有效字段，附带BLOB字段
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExampleWithBLOBs(@Param("record") Record record, @Param("example") Example example);

    /**
     * 根据条件更新记录
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") Record record, @Param("example") Example example);

    /**
     * 根据主键更新记录有效字段
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Record record);

    /**
     * 根据主键更新记录，附带BLOB字段
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeyWithBLOBs(Record record);

    /**
     * 根据主键更新记录
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Record record);

    /**
     * 根据主键批量删除记录
     *
     * @param ids
     * @return
     */
    int deleteByPrimaryKeys(String ids);

}
