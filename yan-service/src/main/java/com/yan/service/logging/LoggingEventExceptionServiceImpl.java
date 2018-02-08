package com.yan.service.logging;

import com.yan.api.logging.LoggingEventExceptionService;
import com.yan.common.service.impl.BaseServiceImpl;
import com.yan.dao.mapper.logging.LoggingEventExceptionMapper;
import com.yan.dao.model.logging.LoggingEventException;
import com.yan.dao.model.logging.LoggingEventExceptionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018/1/27 下午11:42<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Service("loggingEventExceptionService")
public class LoggingEventExceptionServiceImpl extends BaseServiceImpl<LoggingEventExceptionMapper, LoggingEventException, LoggingEventExceptionExample> implements LoggingEventExceptionService {

    @Autowired
    LoggingEventExceptionMapper loggingEventExceptionMapper;
}
