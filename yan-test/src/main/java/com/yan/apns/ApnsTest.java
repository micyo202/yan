package com.yan.apns;

import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsService;

public class ApnsTest {

    /**
     * 苹果APNS消息推送（notnoop无等待）
     * @param args
     */
    public static void main(String[] args) {
        ApnsService service =
                APNS.newService()
                        .withCert("/Users/apple/Desktop/Push Certificate/Development/apns-development.p12", "密码") // 指定p12文件及密钥
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

        String token = "eb0209d8ae5beccbc87c81a95f717a1fcf85ca0c413c14295464600da079eb12";

        service.push(token, payload);
    }

}
