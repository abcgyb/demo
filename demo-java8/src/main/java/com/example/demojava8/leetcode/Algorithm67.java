package com.example.demojava8.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: Algorithm58
 * @Description: 67. 二进制求和 给定两个二进制字符串，返回他们的和（用二进制表示）。输入为非空字符串且只包含数字 1 和 0。
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * @Author: GaoYueBin
 * @Date: 2019-11-19 17:21
 * @Version 1.0
 **/
public class Algorithm67 {

    public String addBinary(String a, String b) {
        List<String> list = new ArrayList<>();
        String[] x = a.split("");
        String[] y = b.split("");
        int nx = x.length - 1, ny = y.length - 1;
        int num = 0;
        while (nx >= 0 || ny >= 0 || num != 0) {
            int n = nx >= 0 ? Integer.parseInt(x[nx]) : 0;
            int m = ny >= 0 ? Integer.parseInt(y[ny]) : 0;
            nx--;
            ny--;
            if (n + m + num == 0) {
                list.add("0");
                num = 0;
            } else if (n + m + num == 1) {
                list.add("1");
                num = 0;
            } else if (n + m + num == 2) {
                list.add("0");
                num = 1;
            } else {
                list.add("1");
                num = 1;
            }
        }
        Collections.reverse(list);
        return String.join("", list);
    }

    public static void main(String[] args) {
        Algorithm67 algorithm67 = new Algorithm67();
        String result = algorithm67.addBinary("11", "1");
        System.out.println("最大的结果为：" + result);
    }
}
