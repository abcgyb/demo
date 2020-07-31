package com.example.demojava8.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lockTest {


    public static void main(String[] args) {
        Data1 data = new Data1();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.incre();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();

        new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                try {
                    data.decre();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, "B").start();

        new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                try {
                    data.decre();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, "C").start();

        new Thread(() -> {
            for (int j = 0; j < 10; j++) {
                try {
                    data.decre();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, "D").start();
    }


}

class Data1 {
    private int number = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public  void incre() throws InterruptedException {
        lock.lock();
        try {
            //业务代码
            while (number != 0){
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "=>" + number);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public  void decre() throws InterruptedException {
        lock.lock();
        try {
            //业务代码
            while (number != 1){
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "=>" + number);
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}