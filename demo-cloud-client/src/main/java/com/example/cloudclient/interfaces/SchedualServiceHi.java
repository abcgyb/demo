package com.example.cloudclient.interfaces;

import com.example.cloudclient.hystrics.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: SchedualServiceHi
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2020-01-09 14:34
 * @Version 1.0
 **/
@FeignClient(value = "app-eureka-server", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
