package com.test.api.testcase.FuncAPI;

import com.hand.basicConstant.Environment;
import com.hand.basicObject.Employee;
import com.test.api.method.EmployeeAccount;
import com.test.api.method.EmployeeLogin;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.AfterTest;

import java.util.Properties;

/**
 * @Author yc
 * @Date 2022/12/26
 * @Version 1.0
 **/
@Slf4j
public class BaseTestApi {
    public static Properties properties;
    public static int multilingual;
    private Employee employee;
    private Customers customers;
    private EmployeeLogin employeeLogin;
    private EmployeeAccount employeeAccount;

    public Customers getCustomer(String env) {
        customers = new Customers(EnvironmentInfor.getEnv(env));
        return customers;
    }



    @AfterTest(alwaysRun = true)
    public void end() {
        log.info("测试结束");
    }

    /**
     * @param employee 员工employee对象
     * @param env      环境 stage/service ..
     * @param username 用户名
     * @param pass     密码
     * @param language 语言
     */
    public void setEmployee(Employee employee, String env, String username, String pass, String language) {
        employee.setPhoneNumber(username);
        employee.setPassWord(pass);
        employee.setLanguage(language);
        employee.setEnv(env);
        employee.setEnvironment(Environment.getEnv(env));
    }
}
