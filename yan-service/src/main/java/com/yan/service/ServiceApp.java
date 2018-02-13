package com.yan.service;

/**
 * 描述: 启动dubbo服务方法
 * <p>
 * 作者: Yanzheng 严正
 * 时间: 2018/1/18 下午5:09
 * 版本: v1.0
 * 版权: Copyright 2017 https://github.com/micyo202. All rights reserved.
 */
public class ServiceApp {

    public static void main(String[] args) {
        System.out.println("Dubbo服务正在启动...");
        com.alibaba.dubbo.container.Main.main(args);
    }

}
