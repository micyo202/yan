package com.yan.api.jms;

import javax.jms.Destination;

/**
 * 名称：JmsSenderService<br>
 * <p>
 * 描述：Jms消息生产者（发送）服务接口<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018-01-22 11:08:49<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public interface JmsSenderService {

    /**
     * 一对一消息方法
     *
     * @param destination   消息目的地
     * @param message       消息内容
     */
    void sendQueue(Destination destination, final String message);

    /**
     * 发布、订阅消息发送
     *
     * @param destination   消息目的地
     * @param message       消息内容
     */
    void sendTopic(Destination destination, final String message);


    /**
     * 一对一消息发送
     *
     * @param name      队列名称
     * @param message   消息内容
     */
    void sendQueue(String name, final String message);

    /**
     * 发布、订阅消息发送
     *
     * @param name      队列名称
     * @param message   消息内容
     */
    void sendTopic(String name, final String message);

}
