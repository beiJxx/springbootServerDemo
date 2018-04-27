package com.nic.springboot.dao;

import com.nic.springboot.core.universal.Mapper;
import com.nic.springboot.model.SpringbootUserInfo;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by james on 2018/4/26 0026.
 */
public interface SpringbootUserInfoMapper extends Mapper<SpringbootUserInfo> {

	SpringbootUserInfo selectById(@Param("id") BigDecimal id);

	List<SpringbootUserInfo> selectAll();

}
