package com.example.cloudclient1.controller;

import com.example.cloudclient1.interfaces.BaseDatalService;
import com.example.cloudclient1.interfaces.SchedualServiceHi;
import com.example.cloudclient1.model.Student;
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
        String result = schedualServiceHi.sayHiFromClientOne(name);
        return result;
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Student> query(String name) {
        List<Student>  result =  baseDatalService.query(name);
        return result;
    }
}
