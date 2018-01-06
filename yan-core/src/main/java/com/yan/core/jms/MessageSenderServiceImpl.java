package com.yan.core.jms;

import com.yan.api.jms.MessageSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * 名称：MessageSenderServiceImpl<br>
 * <p>
 * 描述：Jms消息发送服务接口实现类<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018-01-06 22:34:03<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Service
public class MessageSenderServiceImpl implements MessageSenderService {

    @Autowired
    private JmsTemplate jmsQueueTemplate;

    @Autowired
    private JmsTemplate jmsTopicTemplate;

    @Override
    public void sendQueue(Destination destination, String message) {
        jmsQueueTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
    }

    @Override
    public void sendTopic(Destination destination, String message) {
        jmsTopicTemplate.send(destination, new MessageCreator() {

            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }

        });
    }
}
