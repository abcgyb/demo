package com.example.demoshiro.strategy.strategy.impl;

import com.example.demoshiro.strategy.strategy.StudentStrategyInterface;
import org.springframework.stereotype.Component;

/**
 * @ClassName: NormalStudent
 * @Description: 一般学生
 * @Author: GaoYueBin
 * @Date: 2018-11-23 10:21
 * @Version 1.0
 **/
@Component
public class NormalStudent implements StudentStrategyInterface {

    @Override
    public String examScore() {
        return "一般学生的成绩是：60分";
    }
}
