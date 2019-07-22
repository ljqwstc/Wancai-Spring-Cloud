package com.wancai.springcloud.hystrix.dashboard;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author lin jianquan
 * date: 2019/7/16 11:52
 */
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboard8770Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard8770Application.class, args);
    }
}
