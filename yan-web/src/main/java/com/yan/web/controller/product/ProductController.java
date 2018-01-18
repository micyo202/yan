package com.yan.web.controller.product;

import com.yan.dao.mapper.product.TbProductMapper;
import com.yan.common.model.PageModel;
import com.yan.core.annotation.MapperInject;
import com.yan.core.controller.BaseController;
import com.yan.dao.model.product.TbProduct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 名称：roductController<br>
 * <p>
 * 描述：产品信息管理<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2017-09-06 09:13:00<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Controller
@RequestMapping("/demo/product")
public class ProductController extends BaseController {

    @MapperInject(TbProductMapper.class)
    private TbProductMapper mapper;

    @RequestMapping("/init")
    public String init() {
        return "demo/product/init";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public PageModel<TbProduct> list(int offset, int limit, String search, String sort, String order) {

        // 使用原始方法
        /*
        DataSourceContextHolder.setDataSource("extendDataSource");
		PageHelper.offsetPage(offset, limit);
		List<TbProduct> list = mapper.selectByExample(null);
		DataSourceContextHolder.clearDataSource();
		return new PageModel<>(list);
		*/

        // 使用父类封装方法（推荐）
        this.setDataSource("extendDataSource");
        this.offsetPage(offset, limit);
        List<TbProduct> list = mapper.selectByExample(null);
        this.clearDataSource();
        return this.resultPage(list);
    }

}
