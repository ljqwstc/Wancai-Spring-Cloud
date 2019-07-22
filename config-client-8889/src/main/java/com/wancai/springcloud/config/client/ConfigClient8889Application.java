package com.wancai.springcloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lin jianquan
 * date: 2019/7/16 11:52
 */
@EnableDiscoveryClient
@EnableEurekaClient
@RestController
@SpringBootApplication
@RefreshScope
public class ConfigClient8889Application {

    @Value("${foo}")
    private String foo;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient8889Application.class, args);
    }

    /**
     * http://localhost:8889/actuator/bus-refresh
     */
    @RequestMapping(value = "/hi")
    public String hi() {
        return foo;
    }

}
