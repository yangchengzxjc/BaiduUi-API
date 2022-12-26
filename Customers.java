package com.test.api.testcase.FuncAPI;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yc
 * @Date 2022/12/21
 * @Version 1.0
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customers {
    //登录名
    private  String phoneNumber;
    //登录密码
    private  String passWord;
    //员工名
    private String fullName;
    //userOID
    private String userOID;
    //accessToken登录用户ui页面的toekn
    private String accessToken;
    //枚举环境变量
    private EnvironmentInfor environment;

    public Customers (EnvironmentInfor environment){
        this.environment = environment;
    }
}
