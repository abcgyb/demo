package com.example.demojava8.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * 精准唤醒模式（lock）
 *
 */
public class LockAcNotifyTest {



    public static void main(String[] args) {
        Data2 data = new Data2();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.printA();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();

        new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                try {
                    data.printB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, "B").start();

        new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                try {
                    data.printC();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, "C").start();

    }


}

class Data2 {
    private int printFlag = 1;
    Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    public  void printA() throws InterruptedException {
        lock.lock();
        try {
            //业务代码
            while (printFlag != 1){
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "=>" + "AAAAA");
            printFlag = 2;
            condition2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public  void printB() throws InterruptedException {
        lock.lock();
        try {
            //业务代码
            while (printFlag != 2){
                condition2.await();
            }
            System.out.println(Thread.currentThread().getName() + "=>" + "BBBBB");
            printFlag = 3;
            condition3.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public  void printC() throws InterruptedException {
        lock.lock();
        try {
            //业务代码
            while (printFlag != 3){
                condition3.await();
            }
            System.out.println(Thread.currentThread().getName() + "=>" + "CCCCC");
            printFlag = 1;
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
