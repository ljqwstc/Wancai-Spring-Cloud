package com.wancai.springcloud.feign.config;

import org.springframework.context.annotation.Configuration;

/**
 * Author: lin jianquan
 * Date: 2018/7/11
 * Time: 23:12
 */
@Configuration
public class IRuleConfig {




    //如果用户没有定义IRule接口实现类，则默认使用轮询算法。否则就使用用户自定义的。
    /*@Bean
    public IRule iRule() {

     //return new RandomRule();// Ribbon默认是轮询，我自定义为随机
        //return new RoundRobinRule();// Ribbon默认是轮询，我自定义为随机

        return new FiveTimesRoundRobinRule();
    }*/
}
