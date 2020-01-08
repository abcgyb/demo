package com.example.demojava8.javaeight.base;

/**
 * @ClassName: GybClass
 * @Description:
 * @Author: GaoYueBin
 * @Date: 2019-09-11 18:17
 * @Version 1.0
 **/
public class GybClass {

    public int compare(GybFunction gybFunction, int a, int b) {
        return gybFunction.compare(a, b);
    }

    public int compare1(int a, int b) {
        GybFunction gybFunction = (a1, b1) -> {
            if (a1 > b1) {
                return a1;
            } else {
                return b1;
            }
        };
        return gybFunction.compare(a, b);
    }

    public int compare2(int a, int b) {
        GybFunction gybFunction = (a1, b1) -> {
            if (a1 > b1) {
                return b1;
            } else {
                return a1;
            }
        };
        return gybFunction.compare(a, b);
    }
}
