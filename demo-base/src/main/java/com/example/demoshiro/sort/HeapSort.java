package com.example.demoshiro.sort;

import java.util.Arrays;

/**
 * @ClassName: HeapSort
 * @Description: 堆排序（大顶堆）
 * @Author: GaoYueBin
 * @Date: 2019-10-08 15:35
 * @Version 1.0
 **/
public class HeapSort {

    //创建大顶堆
    public static void maximumHeap(int k, int[] arr, int m) {
        int i, j, temp;
        boolean finished;
        i = k;
        j = 2 * i + 1;
        temp = arr[k];
        finished = false;
        while ((j <= m) && !finished) {
            //孩子结点位置小于数组长度 且 右孩子大于左孩子
            if ((j < m) && (arr[j + 1] > arr[j])) {
                j++;    //把右孩子结点当作最大孩子结点
            }
            //如果最大的孩子结点小于其根节点
            if (temp >= arr[j]) {
                finished = true;    //结束循环
            } else {
                //把最大子节点赋给根结点
                arr[i] = arr[j];
                i = j;
                //循环下一个根结点
                j = 2 * j + 1;
            }
        }
        arr[i] = temp;
    }

    //交换
    public static void heapsort(int[] arrays) {
        int i;
        //从最后一个非叶节点开始构建大顶堆
        for (i = arrays.length / 2 - 1; i >= 0; i--) {
            maximumHeap(i, arrays, arrays.length);
        }
        System.out.println("建堆后：" + Arrays.toString(arrays));
        //从最小的叶子节点开始与根节点进行交换并重新构建大顶堆
        for (i = arrays.length - 1; i >= 1; i--) {
            int temp = arrays[i];
            arrays[i] = arrays[0];
            arrays[0] = temp;
            maximumHeap(0, arrays, i - 1);
        }
        System.out.println(Arrays.toString(arrays));
    }

    public static void main(String[] args) {
        int[] arrays = {49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1};
        heapsort(arrays);
    }
}
