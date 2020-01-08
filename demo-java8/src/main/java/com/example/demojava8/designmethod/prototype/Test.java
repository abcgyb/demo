package com.example.demojava8.designmethod.prototype;

/**
 * @ClassName: Test
 * @Description: 原型模式
 * @Author: GaoYueBin
 * @Date: 2019-12-09 10:18
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Prototype pro1 = new ConcretePrototype("prototype");
        Prototype pro2 = (Prototype) pro1.clone();
        System.out.println(pro1.getName());
        System.out.println(pro2.getName());
    }
}
