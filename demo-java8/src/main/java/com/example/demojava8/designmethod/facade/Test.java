package com.example.demojava8.designmethod.facade;

import com.example.demojava8.designmethod.facade.interfaces.ServiceA;
import com.example.demojava8.designmethod.facade.interfaces.ServiceB;
import com.example.demojava8.designmethod.facade.interfaces.ServiceC;
import com.example.demojava8.designmethod.facade.interfaces.impl.ServiceAImpl;
import com.example.demojava8.designmethod.facade.interfaces.impl.ServiceBImpl;
import com.example.demojava8.designmethod.facade.interfaces.impl.ServiceCImpl;

/**
 * @ClassName: Test
 * @Description: 外观模式
 * @Author: GaoYueBin
 * @Date: 2019-12-10 14:27
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("外观模式测试方法--------------------------");
        Client client = new Client();
        client.methodA();
        client.methodB();
        client.methodC();
        ServiceA serviceA = new ServiceAImpl();
        ServiceB serviceB = new ServiceBImpl();
        ServiceC serviceC = new ServiceCImpl();
        serviceA.methodA();
        serviceB.methodB();
        serviceC.methodC();
    }
}
