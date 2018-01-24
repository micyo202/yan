package com.yan.common.service;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 描述：TODO<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018/1/24 下午4:49<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public interface BaseService<Record, Example> {

    long countByExample(Example example);

    int deleteByExample(Example example);

    int deleteByPrimaryKey(String key);

    int insert(Record record);

    int insertSelective(Record record);

    List<Record> selectByExample(Example example);

    Record selectByPrimaryKey(String key);

    int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example);

    int updateByExample(@Param("record") Record record, @Param("example") Example example);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);

}
