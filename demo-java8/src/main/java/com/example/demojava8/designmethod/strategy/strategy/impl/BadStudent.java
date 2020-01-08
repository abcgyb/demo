package com.example.demojava8.designmethod.strategy.strategy.impl;

import com.example.demojava8.designmethod.strategy.strategy.StudentStrategyInterface;
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
