package com.example.demojava8.designmethod.factory.impl;

import com.example.demojava8.designmethod.factory.Work;

/**
 * @ClassName: StudentWork
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:41
 * @Version 1.0
 **/
public class StudentWork implements Work {
    @Override
    public void doWork() {
        System.out.println("学生写作业!");
    }
}
