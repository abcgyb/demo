package com.example.demoshiro.service;

import com.example.demoshiro.dto.User;

/**
 * @ClassName: UserService
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-07-05 18:31
 * @Version 1.0
 **/
public interface UserService {

    /**
     * @return
     * @Author GaoYueBin
     * @Description 根据用户名查找用户
     * @Date 2019/7/5 17:33
     * @Param
     **/
    User findByUserName(String name);

}
