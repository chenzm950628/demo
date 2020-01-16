package com.example.spring.boot.demo.command.common.global;

import com.example.spring.boot.demo.command.common.entity.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName: GlobalExceptionHandler
 * @Description: 全局异常控制
 * @author: chenzm_bcc
 * @date: 2020/1/10 14:17
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 入参校验异常控制
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResult handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        String className = e.getClass().getSimpleName();
        BindingResult bindingResult = e.getBindingResult();
        StringBuilder errorMessage = new StringBuilder();
        for (ObjectError error : bindingResult.getAllErrors()) {
            errorMessage.append(error.getDefaultMessage()).append("、");
        }
        log.error(className, e);
        return ApiResult.fail(errorMessage.toString());
    }

    /**
     * 其他异常处理
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ApiResult  HandlerException(Exception e) {
        String message = e.getMessage();
        if(StringUtils.isEmpty(message)){
            message = e.getClass().getSimpleName();
        }
        log.error(message, e);
        return ApiResult.fail(message);
    }
}
