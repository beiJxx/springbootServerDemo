package com.nic.springboot.controller;

import com.github.pagehelper.PageInfo;
import com.nic.springboot.core.ret.RetResponse;
import com.nic.springboot.core.ret.RetResult;
import com.nic.springboot.model.SystemLog;
import com.nic.springboot.service.SystemLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* Created by james on 2018/04/27 15:28.
*/
@RestController
@RequestMapping("/systemLog")
@Api(tags = {"systemLog interface"}, description = "SystemLogController")
public class SystemLogController {

    @Resource
    private SystemLogService systemLogService;

    @PostMapping("/insert")
    public RetResult<Integer> insert(SystemLog systemLog) throws Exception{
        Integer state = systemLogService.insert(systemLog);
        return RetResponse.makeOKRsp(state);
    }

    @PostMapping("/deleteById")
    public RetResult<Integer> deleteById(@RequestParam String id) throws Exception {
        Integer state = systemLogService.deleteById(id);
        return RetResponse.makeOKRsp(state);
        }

    @PostMapping("/update")
    public RetResult<Integer> update(SystemLog systemLog) throws Exception {
       Integer state = systemLogService.update(systemLog);
       return RetResponse.makeOKRsp(state);
    }

    @ApiOperation(value = "selectById",notes = "selectSystemLogById")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "query")
    })
    @PostMapping("/selectById")
    public RetResult<SystemLog> selectById(@RequestParam String id) throws Exception {
       SystemLog systemLog = systemLogService.selectById(id);
       return RetResponse.makeOKRsp(systemLog);
    }

    /**
    * @Description: 分页查询
    * @param page 页码
    * @param size 每页条数
    * @Reutrn RetResult<PageInfo<SystemLog>>
    */
    @PostMapping("/list")
    public RetResult<PageInfo<SystemLog>> list(@RequestParam(defaultValue = "0") Integer page,
        @RequestParam(defaultValue = "0") Integer size, SystemLog systemLog) throws Exception {
        PageInfo<SystemLog> pageInfo = systemLogService.selectPage(page, size, systemLog);
        return RetResponse.makeOKRsp(pageInfo);
    }
}
