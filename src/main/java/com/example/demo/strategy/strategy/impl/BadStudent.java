package com.example.demo.strategy.strategy.impl;

import com.example.demo.strategy.strategy.StudentStrategyInterface;
import org.springframework.stereotype.Component;

/**
 * @ClassName: BadStudent
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-23 10:22
 * @Version 1.0
 **/
@Component
public class BadStudent implements StudentStrategyInterface {

    @Override
    public String examScore() {
        return "差学生的成绩是：0分";
    }
}
