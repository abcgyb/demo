package com.example.demojava8.designmethod.proxy;

import com.example.demojava8.designmethod.proxy.interfaces.Object;
import com.example.demojava8.designmethod.proxy.interfaces.impl.ProxyObject;

/**
 * @ClassName: Test
 * @Description: 代理模式
 * @Author: GaoYueBin
 * @Date: 2019-12-13 14:23
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Object obj = new ProxyObject();
        obj.action();
    }
}
