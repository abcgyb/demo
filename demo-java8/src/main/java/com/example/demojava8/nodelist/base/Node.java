package com.example.demojava8.nodelist.base;

/**
 * @ClassName: Node
 * @Description: 链表节点实体类
 * @Author: GaoYueBin
 * @Date: 2019-12-16 16:32
 * @Version 1.0
 **/
public class Node {

    /**
     * 下一个节点
     */
    Node next = null;

    /**
     * 节点数据
     */
    int data;

    /**
     * 节点构造方法
     *
     * @param data
     */
    public Node(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
