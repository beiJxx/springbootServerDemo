package com.nic.springboot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nic.springboot.core.ret.ServiceException;
import com.nic.springboot.core.universal.AbstractService;
import com.nic.springboot.dao.SpringbootUserInfoMapper;
import com.nic.springboot.model.SpringbootUserInfo;
import com.nic.springboot.service.SpringbootUserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by james on 2018/4/26 0026.
 */
@Service
public class SpringbootUserInfoServiceImpl extends AbstractService<SpringbootUserInfo> implements SpringbootUserInfoService {

	@Resource
	private SpringbootUserInfoMapper springbootUserInfoMapper;


	@Override
	public SpringbootUserInfo selectById(BigDecimal id) {
		SpringbootUserInfo springbootUserInfo = springbootUserInfoMapper.selectById(id);
		if(null == springbootUserInfo)
			throw new ServiceException("暂无该用户");
		return springbootUserInfo;
	}

	@Override
	public PageInfo<SpringbootUserInfo> selectPage(Integer page, Integer size, SpringbootUserInfo userInfo) {
		//开启分页查询，写在查询语句上方
		//只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页。
		PageHelper.startPage(page,size);
		List<SpringbootUserInfo> springbootUserInfos = springbootUserInfoMapper.select(userInfo);
		PageInfo<SpringbootUserInfo> pageInfo = new PageInfo<SpringbootUserInfo>(springbootUserInfos);
		return pageInfo;
	}
}
