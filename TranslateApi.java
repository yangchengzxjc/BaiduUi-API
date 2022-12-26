package com.test.api.testcase.FuncAPI;

import com.hand.baseMethod.HttpStatusException;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yc
 * @Date 2022/12/26
 * @Version 1.0
 **/
public class TranslateApi {
    private BaseRequestAPI baseRequestAPI;
   /* private Customers customers;*/
    public void Translate_zh_to_en(Customers customers) throws HttpStatusException {
        String words = "amyotrophic lateral sclerosis";
        String appId = "2015063000000001";//请替换为您的appid
        String signkey = "123456789";//
        String salt = "1435660288";//随机码
        String signValue = null;
        String response= null;
        String url = customers.getEnvironment().getUrl() + BaiduAPIPath.POST_TRANSLATE;
        Map<String, String> Header = new HashMap();
        Map<String, String> urlPramates1 = new HashMap();
        Header.put("Content-Type",BaseConstantHeaders.CONTENT_TYPE);

        //拼接加密key=urlPramates1，加密后=signValue
        urlPramates1.put("appid",appId);
        urlPramates1.put("q", words);
        urlPramates1.put("salt", salt);
        urlPramates1.put("signkey", signkey);
        String sValue = url+Header+urlPramates1;
        signValue = baseRequestAPI.getMD5String(sValue);
        //参数拼接
        Map<String,String> urlPramates = new HashMap<>();
        urlPramates.put("q", words);
        urlPramates.put("from",new Language().getEn());
        urlPramates.put("to",new Language().getZh());
        urlPramates.put("appid",appId);
        urlPramates.put("salt", salt);
        urlPramates.put("domain","medicine");
        urlPramates.put("sign",signValue);
        //发情请求
        response = baseRequestAPI.doGet1(url, Header, urlPramates);
        System.out.println(response);
    }
}
