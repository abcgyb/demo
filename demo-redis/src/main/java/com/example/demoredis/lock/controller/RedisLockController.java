package com.example.demoredis.lock.controller;

import com.example.demoredis.lock.RedisLock;
import com.example.demoredis.lock.request.RedisRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: RedisLockController
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2020-01-13 16:00
 * @Version 1.0
 **/
@RestController
public class RedisLockController {

    @Autowired
    private RedisLock redisLock;

    //超时时间10s
    private static final int TIMEOUT = 30 * 1000;

    @RequestMapping(value = "/redisTest")
    public void lockTest(@RequestBody RedisRequest redisRequest){
        long time = System.currentTimeMillis() + TIMEOUT;
        boolean lock = redisLock.lock(redisRequest.getProductId(),String.valueOf(time));
        if(!lock){
            System.out.println("人太多了，等一会再试吧！");
        }
    }
}
