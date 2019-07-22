package com.wancai.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lin jianquan
 * date: 2019/7/16 11:52
 */
@EnableDiscoveryClient
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServer8888Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer8888Application.class, args);
    }

}
