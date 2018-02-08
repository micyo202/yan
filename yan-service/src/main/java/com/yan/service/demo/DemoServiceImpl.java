package com.yan.service.demo;

import com.yan.api.demo.DemoService;
import org.springframework.stereotype.Service;

/**
 * 名称：DemoServiceImpl<br>
 * <p>
 * 描述：测试接口服务实现类<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018-01-20 09:55:20<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {

        System.out.println("Dubbo RPC 远程调用服务端Demo测试方法-开始执行...");
        String str = "Hello '" + name + "', welcome to dubbo.";
        System.out.println("Dubbo RPC 远程调用服务端Demo测试方法执行完毕！");

        return str;
    }

}
