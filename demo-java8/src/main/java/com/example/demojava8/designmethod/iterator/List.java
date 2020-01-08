package com.example.demojava8.designmethod.iterator;

/**
 * @ClassName: List
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-12-19 11:01
 * @Version 1.0
 **/
public interface List {

    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object object);
}
