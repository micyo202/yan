package com.yan.service.jms;

import com.yan.api.jms.JmsSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * 名称：JmsSenderServiceImpl<br>
 * <p>
 * 描述：Jms消息（生产者）发送服务接口实现类<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018-01-06 22:34:03<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Service("jmsSenderService")
public class JmsSenderServiceImpl implements JmsSenderService {

    @Autowired
    private JmsTemplate jmsQueueTemplate;

    @Autowired
    private JmsTemplate jmsTopicTemplate;

    @Override
    public void sendQueue(Destination destination, String message) {
        jmsQueueTemplate.send(destination, session -> session.createTextMessage(message));
    }

    @Override
    public void sendTopic(Destination destination, String message) {
        jmsTopicTemplate.send(destination, session -> session.createTextMessage(message));
    }

    @Override
    public void sendQueue(String name, String message) {
        jmsQueueTemplate.send(name, session -> session.createTextMessage(message));
    }

    @Override
    public void sendTopic(String name, String message) {
        jmsTopicTemplate.send(name, session -> session.createTextMessage(message));
    }
}
