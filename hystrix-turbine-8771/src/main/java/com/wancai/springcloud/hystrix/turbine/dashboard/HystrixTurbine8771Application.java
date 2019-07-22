package com.wancai.springcloud.hystrix.turbine.dashboard;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author lin jianquan
 * date: 2019/7/16 11:52
 */
@EnableTurbine
@SpringBootApplication
public class HystrixTurbine8771Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbine8771Application.class, args);
    }
}
