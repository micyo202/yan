package com.yan.service.user;

import com.yan.api.user.SysUserService;
import com.yan.common.service.impl.BaseServiceImpl;
import com.yan.dao.mapper.user.SysUserMapper;
import com.yan.dao.model.user.SysUser;
import com.yan.dao.model.user.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018/1/24 上午11:36<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Service("sysUserService")
public class SysUserServiceImpl extends BaseServiceImpl<SysUserMapper, SysUser, SysUserExample> implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

}
