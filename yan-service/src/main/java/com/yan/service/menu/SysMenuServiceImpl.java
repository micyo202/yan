package com.yan.service.menu;

import com.yan.api.menu.SysMenuService;
import com.yan.common.service.impl.BaseServiceImpl;
import com.yan.dao.mapper.menu.SysMenuMapper;
import com.yan.dao.model.menu.SysMenu;
import com.yan.dao.model.menu.SysMenuExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 * @author Yanzheng 严正<br>
 * 时间：<br>
 * 2018/1/27 下午11:48<br>
 * 版权：<br>
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends BaseServiceImpl<SysMenuMapper, SysMenu, SysMenuExample> implements SysMenuService {

    @Autowired
    SysMenuMapper sysMenuMapper;
}
