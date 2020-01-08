package com.example.demojava8.leetcode;

/**
 * @ClassName: Algorithm58
 * @Description: 58. 最后一个单词的长度
 * @Author: GaoYueBin
 * @Date: 2019-11-19 17:21
 * @Version 1.0
 **/
public class Algorithm58 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0 || " ".equals(s)) {
            return 0;
        }

        String[] sA = s.split(" ");
        if (sA.length == 0) {
            return 0;
        }
        return sA[sA.length - 1].length();
    }
}
