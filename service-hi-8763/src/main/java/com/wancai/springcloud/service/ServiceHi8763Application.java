package com.wancai.springcloud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lin jianquan
 * date: 2019/7/16 13:19
 */
@EnableEurekaClient
@SpringBootApplication
public class ServiceHi8763Application {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHi8763Application.class,args);
    }
}
