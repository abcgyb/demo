package com.example.demojava8.designmethod.adapter;

import com.example.demojava8.designmethod.adapter.interfaces.Target;
import com.example.demojava8.designmethod.adapter.interfaces.impl.Adapter;

/**
 * @ClassName: Test
 * @Description: 适配器模式
 * @Author: GaoYueBin
 * @Date: 2019-12-09 10:25
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("适配器模式：测试方法----------------------");
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();
        target.adapterMethod();
    }
}
