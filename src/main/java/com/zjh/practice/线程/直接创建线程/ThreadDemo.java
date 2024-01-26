package com.zjh.practice.线程.直接创建线程;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread t1 = new Thread(myThread);
        t1.setName("线程A");
        t1.start();

        Thread t2 = new Thread(myThread);
        t2.setName("线程B");
        t2.start();

    }
}
