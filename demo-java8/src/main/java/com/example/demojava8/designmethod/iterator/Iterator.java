package com.example.demojava8.designmethod.iterator;

/**
 * @ClassName: Iterator
 * @Description: 迭代器接口
 * @Author: GaoYueBin
 * @Date: 2019-12-18 11:13
 * @Version 1.0
 **/
public interface Iterator {

    Object next();

    void first();

    void last();

    boolean hasNext();

}
