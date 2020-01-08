package com.example.demojava8.nodelist;

import com.example.demojava8.nodelist.base.Node;

import java.util.Hashtable;

/**
 * @ClassName: MyLinkedList
 * @Description: 自定义链表类
 * @Author: GaoYueBin
 * @Date: 2019-12-16 16:35
 * @Version 1.0
 **/
public class MyLinkedList {

    Node head = null;

    /**
     * @return void
     * @Author GaoYueBin
     * @Description 链表添加新的节点
     * @Date 2019/12/16 16:36
     * @Param [data]
     **/
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    /**
     * @return boolean
     * @Author GaoYueBin
     * @Description 删除链表节点
     * @Date 2019/12/16 16:45
     * @Param [index]
     **/
    public boolean deleteNode(int index) {
        if (index < 1 || index > length()) {
            //删除的节点不存在
            return false;
        }
        //直接删除头结点
        if (index == 1) {
            head = head.getNext();
            return true;
        }
        //节点在链表中
        Node preNode = head;
        Node curNode = preNode.getNext();
        int i = 1;
        while (curNode != null) {
            if (index == i) {
                preNode.setNext(curNode.getNext());
                return true;
            }
            preNode = preNode.getNext();
            curNode = curNode.getNext();
            i++;
        }
        return true;
    }

    /**
     * @return int
     * @Author GaoYueBin
     * @Description 获取链表长度
     * @Date 2019/12/16 16:47
     * @Param []
     **/
    public int length() {
        int length = 0;
        Node curNode = head;
        while (curNode != null) {
            length++;
            curNode = curNode.getNext();
        }
        return length;
    }

    /**
     * @return com.example.demojava8.nodelist.base.Node
     * @Author GaoYueBin
     * @Description 链表节点排序
     * @Date 2019/12/16 17:01
     * @Param []
     **/
    public Node linkSort() {
        Node curNode = head;
        while (curNode.getNext() != null) {
            Node nextNode = curNode.getNext();
            while (nextNode != null) {
                if (curNode.getData() > nextNode.getData()) {
                    int temp = curNode.getData();
                    curNode.setData(nextNode.getData());
                    nextNode.setData(temp);
                }
                nextNode = nextNode.getNext();
            }
            curNode = curNode.getNext();
        }
        return head;
    }

    /**
     * @return void
     * @Author GaoYueBin
     * @Description 打印链表
     * @Date 2019/12/16 17:10
     * @Param []
     **/
    public void printLink() {
        Node curNode = head;
        while (curNode != null) {
            System.out.println(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }

    /**
     * @return void
     * @Author GaoYueBin
     * @Description 链表去重
     * @Date 2019/12/16 17:13
     * @Param []
     **/
    public void distinctLink() {
        Node temp = head;
        Node pre = null;
        Hashtable<Integer, Integer> hb = new Hashtable<>();
        while (temp != null) {
            if (hb.containsKey(temp.getData())) {
                pre.setNext(temp.getNext());
            } else {
                hb.put(temp.getData(), 1);
                pre = temp;
            }
            temp = temp.getNext();
        }
    }

    /**
     * @return void
     * @Author GaoYueBin
     * @Description 链表翻转
     * @Date 2019/12/16 17:34
     * @Param []
     **/
    public void reserveLink() {
        Node curNode = head;//头结点
        Node preNode = null;//前一个结点

        while (curNode != null) {
            Node nextNode = curNode.getNext();//保留下一个结点(临时保存)
            curNode.setNext(preNode);//指针反转
            preNode = curNode;//前结点后移
            curNode = nextNode;//当前结点后移
        }
        head = preNode;
    }

    /**
     * @return com.example.demojava8.nodelist.base.Node
     * @Author GaoYueBin
     * @Description 返回倒数第K个节点
     * @Date 2019/12/17 17:16
     * @Param [k]
     **/
    public Node findReverNode(int k) {
        if (k < 1 || k > length()) {
            return null;
        }
        Node first = head;
        Node second = head;
        for (int i = 0; i < k - 1; i++) {
            first = first.getNext();
        }
        while (first.getNext() != null) {
            first = first.getNext();
            second = second.getNext();
        }
        return second;
    }

    /**
     * @return com.example.demojava8.nodelist.base.Node
     * @Author GaoYueBin
     * @Description 查找正数第k个节点
     * @Date 2019/12/17 17:46
     * @Param [k]
     **/
    public Node findNode(int k) {
        if (k < 1 || k > length()) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < k - 1; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    /**
     * @return com.example.demojava8.nodelist.base.Node
     * @Author GaoYueBin
     * @Description 寻找中间节点
     * @Date 2019/12/17 18:31
     * @Param []
     **/
    public Node findMiddleNode() {
        Node slow = head;
        Node quick = head;
        while (quick.getNext() != null && quick.getNext().getNext() != null) {
            slow = slow.getNext();
            quick = quick.getNext().getNext();
        }
        return slow;
    }

    /**
     * @return boolean
     * @Author GaoYueBin
     * @Description 判断链表是否有环(非常重要的算法问题)
     * @Date 2019/12/17 18:35
     * @Param []
     **/
    public boolean isRinged() {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return com.example.demojava8.nodelist.base.Node
     * @Author GaoYueBin
     * @Description 取的链表的最后一个节点
     * @Date 2019/12/17 18:46
     * @Param []
     **/
    public Node getLastNode() {
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    }

    /**
     * @return boolean
     * @Author GaoYueBin
     * @Description 判断两个链表是否相交（两个链表相交，则它们的尾结点一定相同，比较两个链表的尾结点是否相同即可）
     * @Date 2019/12/17 18:49
     * @Param [head1, head2]
     **/
    public boolean isCross(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1.getNext() != null) {
            temp1 = temp1.getNext();
        }
        while (temp2.getNext() != null) {
            temp2 = temp2.getNext();
        }
        if (temp1 == temp2) {
            return true;
        }
        return false;
    }
}
