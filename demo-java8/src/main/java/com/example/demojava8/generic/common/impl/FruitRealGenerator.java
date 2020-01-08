package com.example.demojava8.generic.common.impl;

import com.example.demojava8.generic.common.Generator;

import java.util.Random;

/**
 * @ClassName: FruitRealGenerator
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-09-11 16:43
 * @Version 1.0
 **/
public class FruitRealGenerator implements Generator<String> {

    private String[] fruits = {"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random random = new Random();
        return fruits[random.nextInt(3)];
    }
}
