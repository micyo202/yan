package com.yan.core.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * 名称：QueueMessageListener<br>
 * <p>
 * 描述：Queue消息消费者监听器<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018-01-06 22:34:03<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public class QueueMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        TextMessage textMsg = (TextMessage) message;
        try {
            System.out.println("Queue消息接收者，收到消息内容：" + textMsg.getText());
            System.out.println("Queue消息接收成功！开始调用并执行service方法...");
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
