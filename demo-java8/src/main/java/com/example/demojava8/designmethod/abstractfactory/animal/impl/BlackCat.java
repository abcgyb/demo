package com.example.demojava8.designmethod.abstractfactory.animal.impl;

import com.example.demojava8.designmethod.abstractfactory.animal.Cat;

/**
 * @ClassName: BlackCat
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:23
 * @Version 1.0
 **/
public class BlackCat implements Cat {
    @Override
    public void eat() {
        System.out.println("Black eating");
    }
}
