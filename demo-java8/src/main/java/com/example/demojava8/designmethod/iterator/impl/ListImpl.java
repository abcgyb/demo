package com.example.demojava8.designmethod.iterator.impl;

import com.example.demojava8.designmethod.iterator.Iterator;
import com.example.demojava8.designmethod.iterator.List;

/**
 * @ClassName: ListImpl
 * @Description: 集合自实现类用于迭代器使用
 * @Author: GaoYueBin
 * @Date: 2019-12-19 11:29
 * @Version 1.0
 **/
public class ListImpl implements List {

    private Object[] list;

    private int index;

    private int size;

    public ListImpl() {
        this.list = new Object[100];
        this.index = 0;
        this.size = 0;
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl(this);
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void add(Object object) {
        list[index++] = object;
        size++;
    }
}
