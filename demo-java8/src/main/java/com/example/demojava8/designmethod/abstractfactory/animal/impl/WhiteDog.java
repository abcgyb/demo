package com.example.demojava8.designmethod.abstractfactory.animal.impl;

import com.example.demojava8.designmethod.abstractfactory.animal.Dog;

/**
 * @ClassName: WhiteDog
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-06 16:24
 * @Version 1.0
 **/
public class WhiteDog implements Dog {
    @Override
    public void bark() {
        System.out.println("WhiteDog barking");
    }
}
