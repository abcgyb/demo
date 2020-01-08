package com.example.demojava8.designmethod.factory.impl;

import com.example.demojava8.designmethod.factory.Work;
import com.example.demojava8.designmethod.factory.WorkFactory;

/**
 * @ClassName: TeacherFactory
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:43
 * @Version 1.0
 **/
public class TeacherFactory implements WorkFactory {
    @Override
    public Work createWork() {
        return new TeacherWork();
    }
}
