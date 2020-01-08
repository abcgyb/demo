package com.example.demojava8.designmethod.strategy.client;

import com.example.demojava8.designmethod.strategy.context.ExampleScore;
import com.example.demojava8.designmethod.strategy.strategy.impl.BadStudent;
import com.example.demojava8.designmethod.strategy.strategy.impl.BestStudent;
import com.example.demojava8.designmethod.strategy.strategy.impl.NormalStudent;

/**
 * @ClassName: Client
 * @Description: 策略模式(传入接口类型到构造方法中从而实现一对多策略)
 * @Author: GaoYueBin
 * @Date: 2018-11-23 10:31
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ExampleScore exampleScore = new ExampleScore(new BadStudent());
        String lastScore = exampleScore.examScore();
        System.out.println("最终的成绩是" + lastScore);
    }
}
