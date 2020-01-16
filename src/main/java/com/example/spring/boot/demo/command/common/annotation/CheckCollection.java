package com.example.spring.boot.demo.command.common.annotation;

import com.example.spring.boot.demo.command.common.annotation.impl.CheckCollectionImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * <p>Title:对List类下的对象进行数值校验 </p>
 *
 * @author chenzhaoming
 * @since 2020/1/15
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CheckCollectionImpl.class)
public @interface CheckCollection {
    String message() default "{com.example.spring.boot.demo.command.common.annotation.CheckCollection.message}";
    /**
     * 定义小数位数
     * @return
     */
    int decimal() default Integer.MAX_VALUE;

    /**
     * 定义整数位数
     * @return
     */
    int integer() default Integer.MAX_VALUE;


    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
