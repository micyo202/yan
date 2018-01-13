package com.yan.web.controller.echarts;

import com.yan.core.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述：Echarts示例控制器<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018/1/12 下午1:50<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */

@Controller
@RequestMapping("/echarts")
public class EChartsController extends BaseController {

    /**
     * 页面初始化
     *
     * @return String 页面地址
     */
    @RequestMapping("/init")
    public String init(){
        System.out.println("进入ECharts页面初始化方法");
        return "echarts/init";
    }

}
