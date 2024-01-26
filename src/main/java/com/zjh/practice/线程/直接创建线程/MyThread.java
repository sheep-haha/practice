package com.zjh.practice.线程.直接创建线程;

import lombok.SneakyThrows;

import javax.swing.plaf.IconUIResource;

public class MyThread implements Runnable{

    static volatile int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
                if (count == i) {
                    System.out.println(Thread.currentThread().getName() + ":      " +  count);
                    count++;
                }
        }
    }
}


