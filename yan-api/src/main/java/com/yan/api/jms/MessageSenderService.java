/*
 * Copyright (c) 2017 Yanzheng [https://github.com/micyo202/yan]
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.yan.api.jms;

import javax.jms.Destination;

/**
 * 名称：MessageSenderService<br>
 * <p>
 * 描述：Jms消息生产者（发送）服务接口<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018-01-06 22:34:03<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
public interface MessageSenderService {

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
