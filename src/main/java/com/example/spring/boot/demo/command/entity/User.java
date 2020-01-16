package com.example.spring.boot.demo.command.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * <p>Title:用户类 </p>
 *
 * @author chenzhaoming
 * @since 2020/1/16
 */
@Data
public class User {

    @NotBlank(message = "用户名不能为空")
    private String userName;
}
