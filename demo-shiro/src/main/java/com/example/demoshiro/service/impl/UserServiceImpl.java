package com.example.demoshiro.service.impl;

import com.example.demoshiro.dto.User;
import com.example.demoshiro.mapper.UserMapper;
import com.example.demoshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserService
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-07-05 18:24
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * @return java.util.List<com.example.demoshiro.animal.Student>
     * @Author GaoYueBin
     * @Description 根据用户名查找用户
     * @Date 2019/7/5 17:35
     * @Param [name]
     **/
    @Override
    public User findByUserName(String name) {
        return userMapper.findByUserName(name);
    }


}
