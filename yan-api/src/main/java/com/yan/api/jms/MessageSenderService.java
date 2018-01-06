package com.yan.api.jms;

import javax.jms.Destination;

/**
 * 名称：MessageSenderService<br>
 * <p>
 * 描述：Jms消息发送服务接口<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018-01-06 22:34:03<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public interface MessageSenderService {

    /**
     * 一对一消息队列
     */
    void sendQueue(Destination destination, final String message);

    /**
     * 发布、订阅消息
     */
    void sendTopic(Destination destination, final String message);

}
