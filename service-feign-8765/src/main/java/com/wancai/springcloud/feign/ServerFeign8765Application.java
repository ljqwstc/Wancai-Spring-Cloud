package com.wancai.springcloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lin jianquan
 * date: 2019/7/16 11:52
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ServerFeign8765Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerFeign8765Application.class, args);
    }
}
