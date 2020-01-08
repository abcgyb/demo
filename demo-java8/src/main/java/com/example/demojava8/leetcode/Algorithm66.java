package com.example.demojava8.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: Algorithm66
 * @Description: 66. 加一
 * @Author: GaoYueBin
 * @Date: 2019-11-19 18:11
 * @Version 1.0
 **/
public class Algorithm66 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        double result = 0;
        for (int i = 0; i < digits.length; i++) {
            result = result + digits[i] * Math.pow(10, length - 1 - i);
        }
        int result1 = (int) result + 1;
        String s = new StringBuilder(String.valueOf(result1)).reverse().toString();
        char[] stringArr = s.toCharArray();
        List<Integer> result2 = new ArrayList<>();
        for (int i = 0; i < stringArr.length; i++) {
            result2.add(Integer.parseInt(String.valueOf(stringArr[i])));
        }
        Set<Long> longs = new HashSet<>();
        longs.forEach(aLong -> System.out.println(aLong));
        // return (Integer[])result2.stream().toArray();
        return null;
    }
}
