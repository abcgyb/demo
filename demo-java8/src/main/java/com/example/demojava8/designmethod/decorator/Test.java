package com.example.demojava8.designmethod.decorator;

import com.example.demojava8.designmethod.decorator.interfaces.impl.Man;
import com.example.demojava8.designmethod.decorator.interfaces.impl.ManDecoratorA;
import com.example.demojava8.designmethod.decorator.interfaces.impl.ManDecoratorB;

/**
 * @ClassName: Test
 * @Description: 装饰器模式
 * @Author: GaoYueBin
 * @Date: 2019-12-12 16:49
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorA md1 = new ManDecoratorA();
        ManDecoratorB md2 = new ManDecoratorB();

        md1.setPerson(man);
        md2.setPerson(md1);
        md2.eat();
    }
}
