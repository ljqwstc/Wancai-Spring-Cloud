package com.wancai.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lin jianquan
 * date: 2019/7/16 11:52
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer18761Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer18761Application.class, args);
    }

}
