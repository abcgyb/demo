package com.example.demojava8.designmethod.facade.interfaces.impl;

import com.example.demojava8.designmethod.facade.interfaces.ServiceA;

/**
 * @ClassName: ServiceAImpl
 * @Description: 服务A方法实现类
 * @Author: GaoYueBin
 * @Date: 2019-12-10 14:36
 * @Version 1.0
 **/
public class ServiceAImpl implements ServiceA {

    @Override
    public void methodA() {
        System.out.println("服务A执行!");
    }
}
