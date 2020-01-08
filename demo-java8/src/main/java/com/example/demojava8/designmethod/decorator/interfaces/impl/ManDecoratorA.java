package com.example.demojava8.designmethod.decorator.interfaces.impl;

/**
 * @ClassName: ManDecoratorA
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-12 18:45
 * @Version 1.0
 **/
public class ManDecoratorA extends Decorator {

    public void eat() {
        super.eat();
        reEat();
        System.out.println("ManDecoratorA类");
    }

    public void reEat() {
        System.out.println("在吃一顿饭");
    }
}
