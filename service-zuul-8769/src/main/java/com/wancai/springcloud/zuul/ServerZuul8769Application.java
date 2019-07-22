package com.wancai.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lin jianquan
 * date: 2019/7/16 11:52
 */
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class ServerZuul8769Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerZuul8769Application.class, args);
    }

}
