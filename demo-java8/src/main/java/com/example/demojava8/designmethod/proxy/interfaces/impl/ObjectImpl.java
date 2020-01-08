package com.example.demojava8.designmethod.proxy.interfaces.impl;

import com.example.demojava8.designmethod.proxy.interfaces.Object;

/**
 * @ClassName: ObjectImpl
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-13 14:39
 * @Version 1.0
 **/
public class ObjectImpl implements Object {

    @Override
    public void action() {
        System.out.println("这是被代理的类");
    }
}
