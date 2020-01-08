package com.example.demojava8.generic.common.impl;

import com.example.demojava8.generic.common.Generator;

/**
 * @ClassName: FruitGenerator
 * @Description: 不传入具体类型的实现类
 * @Author: GaoYueBin
 * @Date: 2019-09-11 16:41
 * @Version 1.0
 **/
public class FruitGenerator<T> implements Generator<T> {
    @Override
    public T next() {
        return null;
    }
}
