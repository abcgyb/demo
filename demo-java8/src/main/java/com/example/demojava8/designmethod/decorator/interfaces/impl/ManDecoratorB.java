package com.example.demojava8.designmethod.decorator.interfaces.impl;

/**
 * @ClassName: ManDecoratorB
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-12 18:48
 * @Version 1.0
 **/
public class ManDecoratorB extends Decorator {

    public void eat() {
        super.eat();
        System.out.println("ManDecoratorB类");
    }
}
