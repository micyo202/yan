package com.yan.common.service.impl;

import com.github.pagehelper.PageHelper;
import com.yan.common.constant.DataSourceName;
import com.yan.common.model.PageModel;
import com.yan.common.service.BaseService;
import com.yan.common.spring.DataSourceContextHolder;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 描述：基本base接口，CRUD泛型接口实现类，抽象类只能被继承<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018/1/24 下午4:49<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public abstract class BaseServiceImpl<Mapper, Record, Example> implements BaseService<Record, Example> {

    @Autowired
    private Mapper mapper;

    /**
     * 数据源名称
     * <p>
     * 默认数据源：DataSourceName.DEFAULT (defaultDataSource)
     * 扩展数据源：DataSourceName.EXTEND (extendDataSource)
     */
    private static String DATA_SOURCE_NAME = DataSourceName.DEFAULT.getName();

    @Override
    public void dynamicDataSource(DataSourceName dataSourceName) {
        DATA_SOURCE_NAME = dataSourceName.getName();
    }

    @Override
    public int countByExample(Example example) {
        int res = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method countByExample = mapper.getClass().getDeclaredMethod("countByExample", example.getClass());
            Object result = countByExample.invoke(mapper, example);
            res = Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public int deleteByExample(Example example) {
        int res = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method deleteByExample = mapper.getClass().getDeclaredMethod("deleteByExample", example.getClass());
            Object result = deleteByExample.invoke(mapper, example);
            res = Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        int res = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method deleteByPrimaryKey = mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
            Object result = deleteByPrimaryKey.invoke(mapper, id);
            return Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public int insert(Record record) {
        int res = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method insert = mapper.getClass().getDeclaredMethod("insert", record.getClass());
            Object result = insert.invoke(mapper, record);
            res = Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public int insertSelective(Record record) {
        int res = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method insertSelective = mapper.getClass().getDeclaredMethod("insertSelective", record.getClass());
            Object result = insertSelective.invoke(mapper, record);
            res = Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public List<Record> selectByExampleWithBLOBs(Example example) {
        List<Record> list = null;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method selectByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
            Object result = selectByExampleWithBLOBs.invoke(mapper, example);
            list = (List<Record>) result;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return list;
    }

    @Override
    public List<Record> selectByExample(Example example) {
        List<Record> list = null;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
            Object result = selectByExample.invoke(mapper, example);
            list = (List<Record>) result;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return list;
    }

    @Override
    public PageModel<Record> selectByExampleWithBLOBsForStartPage(Example example, Integer pageNum, Integer pageSize) {
        PageModel<Record> pageModel = null;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method selectByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
            PageHelper.startPage(pageNum, pageSize, false);
            Object result = selectByExampleWithBLOBs.invoke(mapper, example);
            pageModel = new PageModel<>((List<Record>) result);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return pageModel;
    }

    @Override
    public PageModel<Record> selectByExampleForStartPage(Example example, Integer pageNum, Integer pageSize) {
        PageModel<Record> pageModel = null;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
            PageHelper.startPage(pageNum, pageSize, false);
            Object result = selectByExample.invoke(mapper, example);
            pageModel = new PageModel<>((List<Record>) result);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return pageModel;
    }

    @Override
    public PageModel<Record> selectByExampleWithBLOBsForOffsetPage(Example example, Integer offset, Integer limit) {
        PageModel<Record> pageModel = null;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method selectByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
            PageHelper.offsetPage(offset, limit, false);
            Object result = selectByExampleWithBLOBs.invoke(mapper, example);
            pageModel = new PageModel<>((List<Record>) result);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return pageModel;
    }

    @Override
    public PageModel<Record> selectByExampleForOffsetPage(Example example, Integer offset, Integer limit) {
        PageModel<Record> pageModel = null;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
            PageHelper.offsetPage(offset, limit, false);
            Object result = selectByExample.invoke(mapper, example);
            pageModel = new PageModel<>((List<Record>) result);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return pageModel;
    }

    @Override
    public Record selectFirstByExample(Example example) {
        Record res = null;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
            List<Record> result = (List<Record>) selectByExample.invoke(mapper, example);
            if (null != result && result.size() > 0) {
                res = result.get(0);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public Record selectFirstByExampleWithBLOBs(Example example) {
        Record res = null;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method selectByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBs", example.getClass());
            List<Record> result = (List<Record>) selectByExampleWithBLOBs.invoke(mapper, example);
            if (null != result && result.size() > 0) {
                res = result.get(0);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public Record selectByPrimaryKey(String id) {
        Record res = null;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method selectByPrimaryKey = mapper.getClass().getDeclaredMethod("selectByPrimaryKey", id.getClass());
            Object result = selectByPrimaryKey.invoke(mapper, id);
            res = (Record) result;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example) {
        int res = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method updateByExampleSelective = mapper.getClass().getDeclaredMethod("updateByExampleSelective", record.getClass(), example.getClass());
            Object result = updateByExampleSelective.invoke(mapper, record, example);
            res = Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public int updateByExampleWithBLOBs(@Param("record") Record record, @Param("example") Example example) {
        int res = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method updateByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("updateByExampleWithBLOBs", record.getClass(), example.getClass());
            Object result = updateByExampleWithBLOBs.invoke(mapper, record, example);
            res = Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public int updateByExample(@Param("record") Record record, @Param("example") Example example) {
        int res = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method updateByExample = mapper.getClass().getDeclaredMethod("updateByExample", record.getClass(), example.getClass());
            Object result = updateByExample.invoke(mapper, record, example);
            res = Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public int updateByPrimaryKeySelective(Record record) {
        int res = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method updateByPrimaryKeySelective = mapper.getClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
            Object result = updateByPrimaryKeySelective.invoke(mapper, record);
            res = Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Record record) {
        int res = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method updateByPrimaryKeyWithBLOBs = mapper.getClass().getDeclaredMethod("updateByPrimaryKeyWithBLOBs", record.getClass());
            Object result = updateByPrimaryKeyWithBLOBs.invoke(mapper, record);
            res = Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public int updateByPrimaryKey(Record record) {
        int res = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            Method updateByPrimaryKey = mapper.getClass().getDeclaredMethod("updateByPrimaryKey", record.getClass());
            Object result = updateByPrimaryKey.invoke(mapper, record);
            res = Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return res;
    }

    @Override
    public int deleteByPrimaryKeys(String ids) {
        int count = 0;
        try {
            DataSourceContextHolder.setDataSource(DATA_SOURCE_NAME);
            if (!StringUtils.isBlank(ids)) {
                String[] idArray = ids.split("-");
                for (String idStr : idArray) {
                    if (StringUtils.isBlank(idStr)) {
                        continue;
                    }
                    Integer id = Integer.parseInt(idStr);
                    Method deleteByPrimaryKey = mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
                    Object result = deleteByPrimaryKey.invoke(mapper, id);
                    count += Integer.parseInt(String.valueOf(result));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        DataSourceContextHolder.clearDataSource();
        return count;
    }
}
