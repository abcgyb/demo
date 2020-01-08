package com.example.demojava8.designmethod.abstractfactory.animal.impl;

import com.example.demojava8.designmethod.abstractfactory.animal.Cat;

/**
 * @ClassName: WhiteCat
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:21
 * @Version 1.0
 **/
public class WhiteCat implements Cat {

    @Override
    public void eat() {
        System.out.println("WhiteCat eating");
    }
}
