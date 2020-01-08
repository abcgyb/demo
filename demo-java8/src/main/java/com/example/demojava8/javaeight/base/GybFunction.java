package com.example.demojava8.javaeight.base;

/**
 * @ClassName: GybFunction
 * @Description: 自定义函数式接口，判断两个整数大小
 * @Author: GaoYueBin
 * @Date: 2019-09-11 18:09
 * @Version 1.0
 **/
@FunctionalInterface
public interface GybFunction {

    Integer compare(Integer a, Integer b);
}
