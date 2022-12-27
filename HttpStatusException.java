package com.test.api.testcase.FuncAPI;

/**
 * @Author yc
 * @Date 2022/12/27
 * @Version 1.0
 **/
public class HttpStatusException {
    private int httpStatus;

    private String userMessage;

    public HttpStatusException(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public HttpStatusException(int httpStatus, String userMessage) {
        this.httpStatus = httpStatus;
        this.userMessage = userMessage;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public String getUserMessage() {
        return userMessage;
    }
}
