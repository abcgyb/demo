package com.example.demojava8.designmethod.flyweight.interfaces.impl;

import com.example.demojava8.designmethod.flyweight.interfaces.Flyweight;

/**
 * @ClassName: FlyweightImpl
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-13 11:10
 * @Version 1.0
 **/
public class FlyweightImpl implements Flyweight {

    @Override
    public void action(int arg) {
        System.out.println("参数值：" + arg);
    }
}
