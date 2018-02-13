package com.yan.service.user;

import com.yan.api.user.UserRoleRelService;
import com.yan.common.service.impl.BaseServiceImpl;
import com.yan.dao.mapper.user.UserRoleRelMapper;
import com.yan.dao.model.user.UserRoleRel;
import com.yan.dao.model.user.UserRoleRelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018/1/27 下午11:56<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Service("userRoleRelService")
public class UserRoleRelServiceImpl extends BaseServiceImpl<UserRoleRelMapper, UserRoleRel, UserRoleRelExample> implements UserRoleRelService {

    @Autowired
    UserRoleRelMapper userRoleRelMapper;

}
