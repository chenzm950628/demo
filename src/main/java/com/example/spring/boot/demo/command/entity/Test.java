package com.example.spring.boot.demo.command.entity;

import com.example.spring.boot.demo.command.common.annotation.CheckCollection;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>Title:自定义校验注解测试 </p>
 *
 * @author chenzhaoming
 * @since 2020/1/15
 */
@Data
public class Test {

    /**
     * 自定义注解测试
     */
    @NotEmpty
    @CheckCollection(decimal = 2,integer = 4,message = "整数不能超过4位，小数不能超过2位")
    private List<BigDecimal> test;

    @Valid
    private User user;


}
