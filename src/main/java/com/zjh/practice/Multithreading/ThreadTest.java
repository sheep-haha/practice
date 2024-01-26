package com.zjh.practice.Multithreading;

import lombok.SneakyThrows;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadTest {
    /** 下面是使用示例 **/
    @SneakyThrows
    public static void main(String[] args) {

        // 创建有界阻塞队列
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(2);
        // 创建线程池
        MyThreadPool pool = new MyThreadPool(10, workQueue);
        // 提交任务
        pool.execute(()->{
            System.out.println("hello");
        });
    }
}
