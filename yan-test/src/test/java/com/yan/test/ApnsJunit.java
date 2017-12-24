package com.yan.test;

import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsService;
import org.junit.Test;

public class ApnsJunit {

    @Test
    public void test(){

        ApnsService service =
                APNS.newService()
                        .withCert("/Users/apple/Desktop/Push Certificate/Development/apns-development.p12", "123") // 指定p12文件及密钥
                        .withSandboxDestination() // 使用苹果推送测试服务器
                        //.withProductionDestination() // 使用苹果推送生产服务器
                        .build();

        String payload = APNS.newPayload()
                .alertTitle("推送标题") // 标题
                .alertBody("这是消息推送内容") // 内容
                .customField("sourceCode", "01") // 自定义字段 
                .customField("url", "https://www.qq.com") // 自定义字段
                .sound("default") // 提示声音
                //.sound("msgsound.caf") // 提示声音（自定义）
                .badge(1) // 应用角标
                .build();

        String token = "67d05295750c8a324cfb534fc2a4698b99b66f7c1094ccd48c55dcce5c8edd4e";

        service.push(token, payload);

    }

}
