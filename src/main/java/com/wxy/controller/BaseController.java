package com.wxy.controller;

import com.wxy.mapper.BaseMapper;
import com.wxy.response.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wxy
 * @Date 19-9-25 下午3:00
 * @Description TODO
 **/
@Api(description = "查询入口")
@RestController
@RequestMapping("/api")
public class BaseController {

    @Autowired
    private BaseMapper baseMapper;

    @ApiOperation(value = "查询列表", notes = "查询列表")
    @GetMapping("/queryList")
    public ApiResponse queryList() {
        return ApiResponse.success(baseMapper.queryList());
    }

}
