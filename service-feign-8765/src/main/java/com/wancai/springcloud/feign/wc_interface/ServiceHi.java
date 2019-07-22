package com.wancai.springcloud.feign.wc_interface;

import com.wancai.springcloud.common.base.entity.Student;
import com.wancai.springcloud.feign.wc_interface.error.ServiceHiErrorProcess;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author lin jianquan
 * date: 2019/7/16 14:21
 */
//@RequestMapping("/dept")  不能写公共路劲！！
@FeignClient(value = "service-hi",fallbackFactory = ServiceHiErrorProcess.class)
public interface ServiceHi {

    @GetMapping("/hi1")
    String hi1(@RequestParam(value = "name") String name);

    //很奇怪，如果用@PathVariable必须指定value参数名称，就算名称相同也不行
    //但是在Controller层是可以省略不写的。在FeignClient下就不行
    @GetMapping("/hi2/{id}")
    String hi2(@PathVariable(value = "id") Integer id);

    @PostMapping("/hi3")
    String hi3(@RequestBody Student student);
}
