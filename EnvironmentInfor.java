package com.test.api.testcase.FuncAPI;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor

@Getter

public enum EnvironmentInfor {
    PROD("prod", "http://api.fanyi.baidu.com");
    private String environment;
    private String url;

    public static EnvironmentInfor getEnv(String environment) {
        for (EnvironmentInfor env : EnvironmentInfor.values()) {
            if (env.getEnvironment().equals(environment)) {
                return env;
            }
        }
        return PROD;
    }
}
