package com.yan.service.product;

import com.yan.api.product.TbProductService;
import com.yan.common.service.impl.BaseServiceImpl;
import com.yan.common.spring.DataSourceContextHolder;
import com.yan.dao.mapper.product.TbProductMapper;
import com.yan.dao.model.product.TbProduct;
import com.yan.dao.model.product.TbProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018/1/27 下午11:51<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Service("tbProductService")
public class TbProductServiceImpl extends BaseServiceImpl<TbProductMapper, TbProduct, TbProductExample> implements TbProductService {

    @Autowired
    TbProductMapper tbProductMapper;

}
