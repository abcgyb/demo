package com.example.demojava8.designmethod.decorator.interfaces.impl;

import com.example.demojava8.designmethod.decorator.interfaces.Person;

/**
 * @ClassName: Man
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-12 17:02
 * @Version 1.0
 **/
public class Man implements Person {

    @Override
    public void eat() {
        System.out.println("男人在吃饭!");
    }
}
