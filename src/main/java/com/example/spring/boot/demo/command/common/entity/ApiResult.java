package com.example.spring.boot.demo.command.common.entity;

import com.example.spring.boot.demo.command.common.constant.ApiResultEnum;

/**
 * @ClassName: ApiResult
 * @Description: 统一返回结果类
 * @author: chenzm_bcc
 * @date: 2020/1/13 9:07
 */
public class ApiResult<T> {
    /**
     * 状态码：000000成功，其他为失败
     */
    private String returnCode;

    /**
     * 成功为success，其他为失败原因
     */
    private String returnMessage;

    /**
     * 数据结果集
     */
    private T data;

    private ApiResult(String returnCode, String returnMessage, T data) {
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
        this.data = data;
    }

    private static <U> ApiResult success(String returnCode,String returnMessage,U data){
        return new ApiResult<>(returnCode, returnMessage, data);
    }


    public static <U> ApiResult success(U data) {
        return ApiResult.success(ApiResultEnum.API_RESULT_SUCCESS.getReturnCode(),ApiResultEnum.API_RESULT_SUCCESS.getReturnMessage(),data);
    }

    public static ApiResult success() {
        return ApiResult.success(ApiResultEnum.API_RESULT_SUCCESS.getReturnCode(),ApiResultEnum.API_RESULT_SUCCESS.getReturnMessage(),null);
    }

    public static  ApiResult fail(String returnCode,String returnMessage){
        return new ApiResult<>(returnCode, returnMessage, null);
    }

    public static ApiResult fail(String returnMessage){
        return ApiResult.fail(ApiResultEnum.API_RESULT_FAIL.getReturnCode(),returnMessage);
    }

    public static ApiResult fail(){
        return ApiResult.fail(ApiResultEnum.API_RESULT_FAIL.getReturnCode(),ApiResultEnum.API_RESULT_FAIL.getReturnMessage());
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

