package com.wancai.springcloud.service.controller;

import com.wancai.springcloud.common.base.entity.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author lin jianquan
 * date: 2019/7/16 13:01
 */
@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi1")
    public String hi1(@RequestParam(value = "name", defaultValue = "linjianquan") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @GetMapping("/hi2/{id}")
    public String hi2(@PathVariable(value = "id") Integer id) {
        return "hi " + id + " ,i am from port:" + port;
    }

    @PostMapping("/hi3")
    public String hi2(@RequestBody Student student) {
        return "hi " + student.toString() + " ,i am from port:" + port;
    }
}
