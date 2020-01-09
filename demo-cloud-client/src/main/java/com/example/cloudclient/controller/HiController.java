package com.example.cloudclient.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.cloudclient.interfaces.BaseDatalService;
import com.example.cloudclient.interfaces.SchedualServiceHi;
import com.example.cloudclient.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: HiController
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2020-01-09 14:35
 * @Version 1.0
 **/
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @Autowired
    private BaseDatalService baseDatalService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Student> query(String name) {
        List<Student>  result =  baseDatalService.query(name);
        return result;
    }
}
