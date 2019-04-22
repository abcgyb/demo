package com.example.demo.strategy.client;

import com.example.demo.strategy.context.ExampleScore;
import com.example.demo.strategy.strategy.impl.BestStudent;

/**
 * @ClassName: Client
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2018-11-23 10:31
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        ExampleScore exampleScore = new ExampleScore(new BestStudent());
        String lastScore = exampleScore.examScore();
        System.out.println("最终的成绩是" + lastScore);
    }
}
