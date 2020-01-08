package com.example.demojava8.designmethod.iterator;

import com.example.demojava8.designmethod.iterator.impl.ListImpl;

/**
 * @ClassName: Test
 * @Description: 迭代器模式
 * @Author: GaoYueBin
 * @Date: 2019-12-16 15:52
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("迭代器模式测试方法--------------------");
        List list = new ListImpl();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator it = list.iterator();
        System.out.println("第一种迭代方式");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("第二种迭代方式");
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
