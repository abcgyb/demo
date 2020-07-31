package com.example.demoredis.lock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @ClassName: RedisLock
 * @Description: redis分布式锁(超时时间判断,未调用超时时间设置的Redis指令)
 * @Author: GaoYueBin
 * @Date: 2020-01-13 10:48
 * @Version 1.0
 **/
@Component
public class RedisLock {

    @Autowired
    private StringRedisTemplate redisTemplate;

    /**
     * @Author GaoYueBin
     * @Description 分布式锁加锁方法（存在则返回失败,不存在则设置，从而获取到锁）
     * @Date 2020/1/13 10:50
     * @Param [key, value]
     * @return boolean
     **/
    public boolean lock(String key, String value) {
        //redis 的setifabsent方法可以设置超时时间,基于的指令是redis中的setnx
        Boolean islock = redisTemplate.opsForValue().setIfAbsent(key, value);
        if (islock) {
            return true;
        }
        //存在锁则判断当前的锁是否超时，超时则获取锁，否则返回失败
        String currentValue = redisTemplate.opsForValue().get(key);
        if (!StringUtils.isEmpty(currentValue) && Long.valueOf(currentValue) < System.currentTimeMillis()) {
            String oldValue = redisTemplate.opsForValue().getAndSet(key, value);
            if (!StringUtils.isEmpty(oldValue) && oldValue.equals(currentValue)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @Author GaoYueBin
     * @Description 解锁方法
     * @Date 2020/1/13 11:22
     * @Param [key, value]
     * @return void
     **/
    public void unlock(String key, String value) {
        try {
            System.out.println("开始进行解锁操作，传入的key为：" + key + "传入的value：" + value);
            String currentValue = redisTemplate.opsForValue().get(key);
            if (!StringUtils.isEmpty(currentValue) && currentValue.equals(value)) {
                redisTemplate.opsForValue().getOperations().delete(key);
            } else {

            }
        } catch (Exception e) {
            System.out.println("redis分布式锁解锁异常：" + e);
        }
    }

}
