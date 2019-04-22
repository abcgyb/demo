package com.example.demo.strategy.strategy.impl;

import com.example.demo.strategy.strategy.StudentStrategyInterface;
import org.springframework.stereotype.Component;

/**
 * @ClassName: BestStudent
 * @Description: 好学生
 * @Author: GaoYueBin
 * @Date: 2018-11-23 10:19
 * @Version 1.0
 **/
@Component
public class BestStudent implements StudentStrategyInterface {

    @Override
    public String examScore() {
        return "优秀学生的成绩是：100";
    }

}
