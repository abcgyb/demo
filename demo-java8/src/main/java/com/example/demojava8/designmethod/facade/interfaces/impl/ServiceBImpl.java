package com.example.demojava8.designmethod.facade.interfaces.impl;

import com.example.demojava8.designmethod.facade.interfaces.ServiceB;

/**
 * @ClassName: ServiceBImpl
 * @Description: 服务B方法实现类
 * @Author: GaoYueBin
 * @Date: 2019-12-10 14:39
 * @Version 1.0
 **/
public class ServiceBImpl implements ServiceB {

    @Override
    public void methodB() {
        System.out.println("服务B执行!");
    }
}
