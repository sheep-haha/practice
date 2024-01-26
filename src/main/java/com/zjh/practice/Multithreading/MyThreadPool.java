package com.zjh.practice.Multithreading;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// 简化的线程池，仅用来说明工作原理
class MyThreadPool{

    // 保存内部工作线程
    List<WorkerThread> threads = new ArrayList<>();

    // 创建有界阻塞队列
    BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();

    // 构造方法
    MyThreadPool(int poolSize, BlockingQueue<Runnable> workQueue){
        this.workQueue = workQueue;
        // 创建工作线程
        for(int idx=0; idx <poolSize; idx++){
            WorkerThread work = new WorkerThread();
            work.start();
            threads.add(work);
        }
    }
    // 提交任务
    void execute(Runnable command) throws InterruptedException {
        workQueue.put(command);
    }

}

