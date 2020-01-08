package com.example.demojava8.designmethod.factory;

import com.example.demojava8.designmethod.factory.impl.StudentFactory;
import com.example.demojava8.designmethod.factory.impl.TeacherFactory;

/**
 * @ClassName: Test
 * @Description: 工厂方法模式
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:45
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        WorkFactory teacherFactory = new TeacherFactory();
        Work teacher = teacherFactory.createWork();
        teacher.doWork();

        WorkFactory studentFactory = new StudentFactory();
        Work student = studentFactory.createWork();
        student.doWork();
    }
}
