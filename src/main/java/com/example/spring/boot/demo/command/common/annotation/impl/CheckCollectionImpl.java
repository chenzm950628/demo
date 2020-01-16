package com.example.spring.boot.demo.command.common.annotation.impl;

import com.example.spring.boot.demo.command.common.annotation.CheckCollection;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;
import java.util.regex.Pattern;

/**
 * <p>Title: 对List类下的对象进行数值校验</p>
 *
 * @author chenzhaoming
 * @since 2020/1/15
 */
public class CheckCollectionImpl implements ConstraintValidator<CheckCollection, List> {


    private int decimal;
    private int integer;

    @Override
    public void initialize(CheckCollection constraintAnnotation) {
        decimal = constraintAnnotation.decimal();
        integer = constraintAnnotation.integer();
    }

    @Override
    public boolean isValid(List list, ConstraintValidatorContext context) {
        String regx = "^(-)?\\d{1}";
        if (integer > 1) {
            regx = "^(((-)?[1-9]{1}\\d{0,"+(integer-1)+"})|[0]{1})";
        }
        // 如果小数位数设置了大于0，这校验小数位数
        if (decimal > 0) {
            regx += "(\\.(\\d){1," + (decimal) + "})?";
        }

        regx += "$";
        for (Object o : list) {
            String item = o.toString();
            // 如果有一个数不符合,则校验不通过
            if (!Pattern.matches(regx, item)) {
                return false;
            }
        }
        return true;
    }
}
