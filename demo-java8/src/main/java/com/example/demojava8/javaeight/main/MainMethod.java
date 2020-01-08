package com.example.demojava8.javaeight.main;

import com.example.demojava8.javaeight.base.GybClass;
import com.example.demojava8.javaeight.base.GybFunction;
import com.example.demojava8.javaeight.base.OperateSystem;
import com.example.demojava8.javaeight.base.Sumable;

import java.util.function.Predicate;

/**
 * @ClassName: MainMethod
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-09-11 17:38
 * @Version 1.0
 **/
public class MainMethod {
    public static void main(String[] args) {
        method((a, b) -> a + b);
        method((a, b) -> a * b);
        //常用函数式接口(判断函数)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(3));
        //自定义函数式接口(比较大小)
        compare((a, b) -> {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }, 0, 1);

        GybClass gybClass = new GybClass();
        int result = gybClass.compare((a, b) -> {
            if (a > b) {
                return a + 3;
            } else {
                return b + 3;
            }
        }, 2, 3);
        System.out.println("测试的结果为：" + result);

        OperateSystem os = () -> {
            System.out.println("2121");
        };
        os.run();

        //最终实现，在类中进行
        int result1 = gybClass.compare1(999, 888);
        System.out.println(result1);
        int result2 = gybClass.compare2(999, 888);
        System.out.println(result2);
    }

    public static void method(Sumable sumable) {
        int result = sumable.sum(10, 20);
        System.out.println("result:" + result);
    }

    public static void compare(GybFunction gybFunction, int a, int b) {
        System.out.println(gybFunction.compare(a, b));
    }
}
