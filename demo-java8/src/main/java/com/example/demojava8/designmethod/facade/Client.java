package com.example.demojava8.designmethod.facade;

import com.example.demojava8.designmethod.facade.interfaces.ServiceA;
import com.example.demojava8.designmethod.facade.interfaces.ServiceB;
import com.example.demojava8.designmethod.facade.interfaces.ServiceC;
import com.example.demojava8.designmethod.facade.interfaces.impl.ServiceAImpl;
import com.example.demojava8.designmethod.facade.interfaces.impl.ServiceBImpl;
import com.example.demojava8.designmethod.facade.interfaces.impl.ServiceCImpl;

/**
 * @ClassName: Client
 * @Description: 外观类
 * @Author: GaoYueBin
 * @Date: 2019-12-10 14:42
 * @Version 1.0
 **/
public class Client {

    private ServiceA serviceA;

    private ServiceB serviceB;

    private ServiceC serviceC;

    public Client() {
        this.serviceA = new ServiceAImpl();
        this.serviceB = new ServiceBImpl();
        this.serviceC = new ServiceCImpl();
    }

    void methodA() {
        serviceA.methodA();
    }

    void methodB() {
        serviceB.methodB();
    }

    void methodC() {
        serviceC.methodC();
    }
}
