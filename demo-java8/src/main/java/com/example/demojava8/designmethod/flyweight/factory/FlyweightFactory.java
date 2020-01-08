package com.example.demojava8.designmethod.flyweight.factory;

import com.example.demojava8.designmethod.flyweight.interfaces.Flyweight;
import com.example.demojava8.designmethod.flyweight.interfaces.impl.FlyweightImpl;

import java.util.HashMap;
import java.util.Objects;

/**
 * @ClassName: FlyweightFactory
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-13 11:17
 * @Version 1.0
 **/
public class FlyweightFactory {

    private static HashMap flyweights = new HashMap();

    public FlyweightFactory(String arg) {
        flyweights.put(arg, new FlyweightImpl());
    }

    public static Flyweight getFlyweight(String key) {
        if (Objects.isNull(flyweights.get(key))) {
            flyweights.put(key, new FlyweightImpl());
        }
        return (Flyweight) flyweights.get(key);
    }

    public static int getSize() {
        return flyweights.size();
    }
}
