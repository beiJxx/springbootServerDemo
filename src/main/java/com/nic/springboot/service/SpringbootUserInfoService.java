package com.nic.springboot.service;

import com.github.pagehelper.PageInfo;
import com.nic.springboot.core.universal.Service;
import com.nic.springboot.model.SpringbootUserInfo;

import java.math.BigDecimal;

/**
 * Created by james on 2018/4/26 0026.
 */
public interface SpringbootUserInfoService extends Service<SpringbootUserInfo> {

	SpringbootUserInfo selectById(BigDecimal id);

	PageInfo<SpringbootUserInfo> selectPage(Integer page, Integer size, SpringbootUserInfo userInfo);

}
