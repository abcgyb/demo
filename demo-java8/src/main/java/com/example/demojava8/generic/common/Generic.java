package com.example.demojava8.generic.common;

import java.util.List;

/**
 * @ClassName: Generic
 * @Description: 最普通的泛型类
 * @Author: GaoYueBin
 * @Date: 2019-09-11 16:28
 * @Version 1.0
 **/
public class Generic<T> {
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public <T> void printMsg(T... args) {
        for (T t : args) {
            System.out.println("泛型测试t is " + t);
        }
    }

    public <T> void printMsg2(List<T> args) {
        for (T t : args) {
            System.out.println("泛型测试t is " + t);
        }
    }

}
