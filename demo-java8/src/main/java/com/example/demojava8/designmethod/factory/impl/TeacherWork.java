package com.example.demojava8.designmethod.factory.impl;

import com.example.demojava8.designmethod.factory.Work;

/**
 * @ClassName: TeacherWork
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:38
 * @Version 1.0
 **/
public class TeacherWork implements Work {
    @Override
    public void doWork() {
        System.out.println("老师审批作业!");
    }
}
