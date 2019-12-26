package com.example.spring.boot.demo.command.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title:用户控制层 </p>
 *
 * @author chenzhaoming
 * @since 2019/12/26
 */
@Api(tags = "系统管理")
@RequestMapping("api/user")
@Controller
public class UserController {

    @ApiOperation("注册")
    @PostMapping()
    public void insert(){
        System.out.println(111);
    }
}
