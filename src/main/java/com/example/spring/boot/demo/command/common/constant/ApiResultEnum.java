package com.example.spring.boot.demo.command.common.constant;

/**
 * @ClassName: ApiResult
 * @Description: 统一返回枚举类
 * @author: chenzm_bcc
 * @date: 2020/1/13 9:07
 */
public enum ApiResultEnum {
    API_RESULT_SUCCESS("000000", "success"),
    API_RESULT_FAIL("000001", "处理失败！");

    private String returnCode;
    private String returnMessage;

    ApiResultEnum(String returnCode, String returnMessage) {
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
    }


    public String getReturnCode() {
        return returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }
}
