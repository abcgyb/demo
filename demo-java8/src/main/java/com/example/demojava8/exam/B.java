package com.example.demojava8.exam;

/**
 * @ClassName: Test
 * @Description: 以下代码的输出结果是？
 * @Author: GaoYueBin
 * @Date: 2019-12-09 15:06
 * @Version 1.0
 **/
public class B {
    public static B t1 = new B();
    public static B t2 = new B();

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        B t = new B();
    }
}
