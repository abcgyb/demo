package com.example.demoshiro.mapper;

import com.example.demoshiro.dto.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserMapper
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-07-05 10:30
 * @Version 1.0
 **/
@Component
public interface UserMapper {

    User findByUserName(@Param("username") String username);
}
