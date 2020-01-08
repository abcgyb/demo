package com.example.demojava8.designmethod.proxy.interfaces.impl;

import com.example.demojava8.designmethod.proxy.interfaces.Object;

/**
 * @ClassName: ProxyObject
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-13 14:34
 * @Version 1.0
 **/
public class ProxyObject implements Object {
    Object obj;

    public ProxyObject() {
        System.out.println("这个是代理类");
        this.obj = new ObjectImpl();
    }

    @Override
    public void action() {
        System.out.println("代理开始");
        obj.action();
        System.out.println("代理结束");
    }
}
