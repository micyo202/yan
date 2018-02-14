package com.yan.web.controller.product;

import com.yan.api.product.TbProductService;
import com.yan.common.constant.DataSourceName;
import com.yan.common.model.PageModel;
import com.yan.core.controller.BaseController;
import com.yan.dao.model.product.TbProduct;
import com.yan.dao.model.product.TbProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Autowired
    private TbProductService tbProductService;

    @RequestMapping("/init")
    public String init() {
        return "demo/product/init";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public PageModel<TbProduct> list(int offset, int limit, String search, String sort, String order) {
        TbProductExample example = new TbProductExample();
        PageModel<TbProduct> pageModel = tbProductService.selectByExampleForOffsetPage(example, offset, limit);
        return pageModel;
    }

}
