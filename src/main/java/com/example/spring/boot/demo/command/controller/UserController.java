package com.example.spring.boot.demo.command.controller;

import com.example.spring.boot.demo.command.common.entity.ApiResult;
import com.example.spring.boot.demo.command.entity.Test;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title:用户控制层 </p>
 *
 * @author chenzhaoming
 * @since 2019/12/26
 */
@Api(tags = "系统管理")
@RequestMapping("api/user")
@RestController
public class UserController {

    @ApiOperation("注册")
    @PostMapping()
    public ApiResult insert(@Validated @RequestBody Test test){
        return ApiResult.success();
    }
}
