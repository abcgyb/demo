package com.example.demojava8.designmethod.adapter.interfaces.impl;

import com.example.demojava8.designmethod.adapter.Adaptee;
import com.example.demojava8.designmethod.adapter.interfaces.Target;

/**
 * @ClassName: Adapter
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-09 13:47
 * @Version 1.0
 **/
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMethod() {
        adaptee.adapteeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("Adapter Method");
    }
}
