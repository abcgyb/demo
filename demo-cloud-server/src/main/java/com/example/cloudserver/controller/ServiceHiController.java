package com.example.cloudserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: controller
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2020-01-09 14:50
 * @Version 1.0
 **/
@RestController
public class ServiceHiController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
