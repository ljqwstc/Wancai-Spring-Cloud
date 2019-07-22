package com.wancai.springcloud.feign.hystrix.wc_interface.error;

import com.wancai.springcloud.common.base.entity.Student;
import com.wancai.springcloud.feign.hystrix.wc_interface.ServiceHi;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author lin jianquan
 * date: 2019/7/16 14:44
 * The fallback class must implement the interface annotated by this annotation and be a valid spring bean.
 * 因为不是service服务，只是一个服务降级发生时的一个方法回调。所以注解为@Component组件，会更加恰当
 * 建议还是实现FallbackFactory这个接口,当然也可以直接实现ServiceHi接口。
 * 1.如果是实现FallbackFactory这个接口，则需要在接口中的@FeignClient注解中指定fallbackFactory的class
 * 2.如果是实现ServiceHi这个接口，则需要在接口中的@FeignClient注解中指定fallback的class
 */
@Component
public class ServiceHiErrorProcess implements FallbackFactory<ServiceHi> {

    @Override
    public ServiceHi create(Throwable throwable) {
        return new ServiceHi() {
            @Override
            public String hi1(String name) {
                return "sorry hi1"+name;
            }

            @Override
            public String hi2(Integer id) {
                return "sorry hi2"+id;
            }

            @Override
            public String hi3(Student student) {
                return "sorry hi3"+student;
            }
        };
    }
}
