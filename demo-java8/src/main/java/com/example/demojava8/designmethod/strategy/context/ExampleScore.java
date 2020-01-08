package com.example.demojava8.designmethod.strategy.context;

import com.example.demojava8.designmethod.strategy.strategy.StudentStrategyInterface;

/**
 * @ClassName: ExampleScore
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-23 10:23
 * @Version 1.0
 **/
public class ExampleScore {

    private StudentStrategyInterface studentStrategyInterface;

    public ExampleScore(StudentStrategyInterface studentStrategyInterface) {
        this.studentStrategyInterface = studentStrategyInterface;
    }

    public String examScore() {
        return studentStrategyInterface.examScore();
    }
}
