package com.example.demojava8.leetcode;

/**
 * @ClassName: Algorithm58
 * @Description: 53. 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6
 * @Author: GaoYueBin
 * @Date: 2019-11-19 17:21
 * @Version 1.0
 **/
public class Algorithm53 {

    public int maxChildAdrr(int[] num) {
        int max = num[0];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        Algorithm53 algorithm53 = new Algorithm53();
        int result = algorithm53.maxChildAdrr(new int[]{-2, 1, -3, 4, -1, 0, -2, -6, 4});
        System.out.println("最大的结果为：" + result);
    }
}
