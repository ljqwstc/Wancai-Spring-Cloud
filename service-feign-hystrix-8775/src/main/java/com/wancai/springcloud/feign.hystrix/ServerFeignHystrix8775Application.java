package com.wancai.springcloud.feign.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lin jianquan
 * date: 2019/7/16 11:52
 */
//开启feign的Hystrix监控！！！很重要哦。很棒棒的哦！！可以对FeignClient的回调类里面所有的方法都进行监控！！
//需要在项目中添加actuator依赖。在yml中设置feign.hystrix.enabled=true。当然这个属性，就算不监控，服务降级处理也要这样设置！
@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ServerFeignHystrix8775Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerFeignHystrix8775Application.class, args);
    }

}
