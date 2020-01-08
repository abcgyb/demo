package com.example.demojava8.designmethod.iterator.impl;

import com.example.demojava8.designmethod.iterator.Iterator;
import com.example.demojava8.designmethod.iterator.List;


/**
 * @ClassName: IteratorImpl
 * @Description: 迭代器实现类
 * @Author: GaoYueBin
 * @Date: 2019-12-18 11:15
 * @Version 1.0
 **/
public class IteratorImpl implements Iterator {

    private List list;

    private int index;

    public IteratorImpl(List list) {
        this.list = list;
        index = 0;
    }

    @Override
    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void last() {
        index = list.getSize();
    }

    @Override
    public boolean hasNext() {
        return index < list.getSize();
    }
}
