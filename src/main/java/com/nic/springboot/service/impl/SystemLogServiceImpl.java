package com.nic.springboot.service.impl;

import com.nic.springboot.dao.SystemLogMapper;
import com.nic.springboot.model.SystemLog;
import com.nic.springboot.service.SystemLogService;
import com.nic.springboot.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* Created by james on 2018/04/27 15:28.
*/
@Service
public class SystemLogServiceImpl extends AbstractService<SystemLog> implements SystemLogService {

    @Resource
    private SystemLogMapper systemLogMapper;

}
