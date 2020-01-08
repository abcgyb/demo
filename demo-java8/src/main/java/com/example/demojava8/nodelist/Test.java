package com.example.demojava8.nodelist;

import com.example.demojava8.nodelist.base.Node;

/**
 * @ClassName: Test
 * @Description: 链表相关操作
 * @Author: GaoYueBin
 * @Date: 2019-12-16 16:31
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("链表相关操作测试方法---------------");
        MyLinkedList myLinkedList = new MyLinkedList();
        //添加链表结点
        myLinkedList.addNode(9);
        myLinkedList.addNode(8);
        myLinkedList.addNode(6);
        myLinkedList.addNode(3);
        myLinkedList.addNode(5);

        //打印链表
        myLinkedList.printLink();

        //打印链表节点个数
        System.out.println("链表节点个数为：" + myLinkedList.length());

        //链表排序
        Node head = myLinkedList.linkSort();
        System.out.println("排序后的头结点为：" + head.getData());
        myLinkedList.printLink();

        myLinkedList.reserveLink();
        myLinkedList.printLink();
    }
}
