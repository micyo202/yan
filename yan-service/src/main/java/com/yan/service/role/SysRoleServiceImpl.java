package com.yan.service.role;

import com.yan.api.role.SysRoleService;
import com.yan.common.service.impl.BaseServiceImpl;
import com.yan.dao.mapper.role.SysRoleMapper;
import com.yan.dao.model.role.SysRole;
import com.yan.dao.model.role.SysRoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018/1/27 下午11:54<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Service("sysRoleService")
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleMapper, SysRole, SysRoleExample> implements SysRoleService {

    @Autowired
    SysRoleMapper sysRoleMapper;

}
