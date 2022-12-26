package com.test.api.testcase.FuncAPI;

import lombok.Data;

/**
 * @Author yc
 * @Date 2022/12/23
 * @Version 1.0
 **/
@Data
public class APIResponseInfro {
    private int statusCode;
    //spanId
    private String spanId;
    private String body;
    //单位为毫秒
    private Long time;
    public APIResponseInfro() {}
}
