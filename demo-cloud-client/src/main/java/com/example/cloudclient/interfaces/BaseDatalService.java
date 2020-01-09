package com.example.cloudclient.interfaces;

import com.example.cloudclient.hystrics.BaseDatalServiceHystric;
import com.example.cloudclient.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName: SchedualServiceHi
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2020-01-09 14:34
 * @Version 1.0
 **/
@FeignClient(value = "app-eureka-dataserver", fallback = BaseDatalServiceHystric.class)
public interface BaseDatalService {

    @RequestMapping(value = "/gyb/query",method = RequestMethod.POST)
    List<Student> query(@RequestParam(value = "name") String name);
}
