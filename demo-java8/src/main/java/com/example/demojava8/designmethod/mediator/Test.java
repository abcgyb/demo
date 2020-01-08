package com.example.demojava8.designmethod.mediator;

import com.example.demojava8.designmethod.mediator.impl.ConcreteMediator;

/**
 * @ClassName: Test
 * @Description: 中介者模式
 * @Author: GaoYueBin
 * @Date: 2019-12-20 17:10
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("中介者模式测试方法-----------------");
        Mediator mediator = new ConcreteMediator();
        System.out.println("老板来了");
        mediator.notice("boss");
        System.out.println("客户来了");
        mediator.notice("client");
    }
}
