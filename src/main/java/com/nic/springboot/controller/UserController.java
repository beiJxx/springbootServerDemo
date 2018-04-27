package com.nic.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nic.springboot.core.ret.RetResponse;
import com.nic.springboot.core.ret.RetResult;
import com.nic.springboot.model.SpringbootUserInfo;
import com.nic.springboot.service.SpringbootUserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by james on 2018/4/26 0026.
 */
@RestController
@RequestMapping("userInfo")
@Api(tags = {"用户操作接口"}, description = "userController")
public class UserController {

	@Resource
	private SpringbootUserInfoService springbootUserInfoService;

	@PostMapping("/hello")
	public String hello(){
		return "hello springboot";
	}

	@ApiOperation(value = "查询用户",notes = "根据用户id查询用户")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String", paramType = "query")
	})
	@PostMapping("/selectById")
	public RetResult<SpringbootUserInfo> selectById(@RequestParam String id){
		return RetResponse.makeOKRsp(springbootUserInfoService.selectById(id));
	}

	@ApiOperation(value = "查询用户",notes = "根据conditon条件查询用户")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "query")
	})
	@PostMapping("/selectByCondition")
	public RetResult<List<SpringbootUserInfo>> selectByCondition(@RequestParam BigDecimal id){
		Condition condition = new Condition(SpringbootUserInfo.class);
		condition.createCriteria().andEqualTo("id",id);
		List<SpringbootUserInfo> springbootUserInfos1 = springbootUserInfoService.selectByCondition(condition);
		return RetResponse.makeOKRsp(springbootUserInfos1);
	}

	@PostMapping("/testException")
	public RetResult<SpringbootUserInfo> testException(BigDecimal id){
		List a = null;
		a.size();
		SpringbootUserInfo userInfo = springbootUserInfoService.selectById(id);
		return RetResponse.makeOKRsp(userInfo);
	}

	@ApiOperation(value = "查询用户", notes = "分页查询用户所有")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "page", value = "当前页码",
					dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "size", value = "每页显示条数",
					dataType = "Integer", paramType = "query")
	})
	@PostMapping("/selectAll")
	public RetResult<PageInfo<SpringbootUserInfo>> selectAll(@RequestParam(defaultValue = "0") Integer page,
	                                                         @RequestParam(defaultValue = "0") Integer size) {
//		PageInfo<SpringbootUserInfo> pageInfo = springbootUserInfoService.selectPage(page, size,null);
		PageHelper.startPage(page,size);
		List<SpringbootUserInfo> springbootUserInfos = springbootUserInfoService.selectAll();
		PageInfo<SpringbootUserInfo> pageInfo = new PageInfo<>(springbootUserInfos);
		return RetResponse.makeOKRsp(pageInfo);
	}

}
