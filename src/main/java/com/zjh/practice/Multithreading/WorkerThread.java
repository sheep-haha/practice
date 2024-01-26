package com.zjh.practice.Multithreading;

import lombok.SneakyThrows;

import java.util.concurrent.BlockingQueue;

// 工作线程负责消费任务，并执行任务
class WorkerThread extends Thread{

    // 利用阻塞队列实现生产者 - 消费者模式
    BlockingQueue<Runnable> workQueue;

    @Override
    @SneakyThrows
    public void run() {
        // 循环取任务并执行
        while(true){
            // 从阻塞队列中取出一个可运行的任务
            Runnable task = workQueue.take();
            task.run();
        }
    }
}