package com.example.demojava8.generic.main;

import com.example.demojava8.generic.common.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: GenericMainMethod
 * @Description: 基本泛型类测试方法
 * @Author: GaoYueBin
 * @Date: 2019-09-11 16:31
 * @Version 1.0
 **/
public class GenericMainMethod {
    public static void main(String[] args) {
        //泛型整型测试
        Generic<Integer> genericInteger = new Generic<>(12345);
        System.out.println("泛型测试key is " + genericInteger.getKey());
        //泛型String类型测试
        Generic<String> stringGeneric = new Generic<>("你大爷");
        System.out.println("泛型测试key is " + stringGeneric.getKey());
        //也可以不传入具体类型
        Generic generic = new Generic(true);
        System.out.println("泛型测试key is " + generic.getKey());

        Generic<Integer> gInteger = new Generic<>(123);
        Generic<Number> gNumber = new Generic<>(456);
        showKeyValue(gNumber);
        showKeyValue(gInteger);

        //泛型方法测试
        generic.printMsg("111", 222, "aaaa", "2323.4", 55.55);
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        generic.printMsg2(test);
    }

    /**
     * @return
     * @Author GaoYueBin
     * @Description 泛型方法
     * @Date 2019/9/11 16:51
     * @Param
     **/
    public static void showKeyValue(Generic<?> obj) {
        System.out.println("泛型测试key is " + obj.getKey());
    }
}
