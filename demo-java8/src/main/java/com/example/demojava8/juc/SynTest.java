package com.example.demojava8.juc;

/**
 *
 * 传统的synchronized消费者模式
 *
 */
public class SynTest {

    public static void main(String[] args) {
        Data data = new Data();

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

class Data {
    private int number = 0;

    public synchronized void incre() throws InterruptedException {
        while (number != 0){
            this.wait();
        }
        //虚假唤醒
/*        if (number != 0) {
            this.wait();
        }*/
        number++;
        System.out.println(Thread.currentThread().getName() + "=>" + number);
        this.notifyAll();
    }

    public synchronized void decre() throws InterruptedException {
        while (number != 1){
            this.wait();
        }
        //虚假唤醒
/*        if (number != 1) {
            this.wait();
        }*/
        number--;
        System.out.println(Thread.currentThread().getName() + "=>" + number);
        this.notifyAll();
    }
}