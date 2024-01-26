package com.zjh.practice.Multithreading;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 1. 线程池里的线程数量为2
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // 2. 定义业务操作

        // 业务A
        Callable<Integer> callableA = () -> {
            // 模拟耗时操作，一般这里写业务逻辑
            Thread.sleep(3000);
            return 1;
        };

        // 业务B
        Callable<Integer> callableB = () -> {
            // 模拟耗时操作
            Thread.sleep(2000);
            return 2;
        };

        // 3. 提交任务
        Future<Integer> future1 = executor.submit(callableA);
        Future<Integer> future2 = executor.submit(callableB);

        // 4. 关闭线程池
        executor.shutdown();

        // 5. 获取线程执行结果
        Integer result1 = future1.get();
        Integer result2 = future2.get();

        System.out.println("Result A------>" + result1);
        System.out.println("Result B------>" + result2);
    }
}
