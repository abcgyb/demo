package com.example.demojava8.designmethod.abstractfactory.animal.impl;

import com.example.demojava8.designmethod.abstractfactory.animal.Dog;

/**
 * @ClassName: BlackDog
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:25
 * @Version 1.0
 **/
public class BlackDog implements Dog {
    @Override
    public void bark() {
        System.out.println("BlackDog barking");
    }
}
