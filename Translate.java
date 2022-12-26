package com.test.api.testcase.FuncAPI;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yc
 * @Date 2022/12/23
 * @Version 1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Translate {
    //
    private String q;
    //被翻译的语言缩写
    private String from;
    //要翻译的目标语言缩写
    private String to;
    //请替换为您的appid
    private String appid;
    //随机码
    private String salt;
    //平台分配的密钥
    private String domain;
    //拼接字符串1，appid+q+salt+domain+密钥
    //appid=2015063000000001+q=amyotrophic lateral sclerosis+salt=1435660288+domain=medicine+密钥=12345678
    //如得到字符串1：“2015063000000001amyotrophic lateral sclerosis1435660288medicine12345678”
    //对字符串1做md5加密
    private String sign;
}
