package com.wancai.springcloud.feign.controller;

import com.wancai.springcloud.common.base.entity.Student;
import com.wancai.springcloud.feign.wc_interface.ServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lin jianquan
 * date: 2019/7/16 13:01
 */
@RestController
public class HelloController {

    @Autowired
    private ServiceHi serviceHi;

    @GetMapping("/hi1")
    public String hi1(@RequestParam(value = "name", defaultValue = "linjianquan") String name) {
        return serviceHi.hi1(name);
    }

    @GetMapping("/hi2/{id}")
    public String hi2(@PathVariable(value = "id") Integer id) {
        return serviceHi.hi2(id);
    }

    @PostMapping("/hi3")
    public String hi2(@RequestBody Student student) {
        return serviceHi.hi3(student);
    }
}
