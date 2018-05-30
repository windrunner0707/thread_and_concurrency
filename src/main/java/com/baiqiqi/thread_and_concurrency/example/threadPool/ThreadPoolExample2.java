package com.baiqiqi.thread_and_concurrency.example.threadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 定值线程池,只有3个线程执行
 * 匿名内部类写法
 * FixedThreadPool适用于为了满足资源管理的需求,而需要限制当前线程数量的应用场
 * 景,它适用于负载比较重的服务器。
 */
@Slf4j
public class ThreadPoolExample2 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            final int index = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    log.info("task:{}", index);
                }
            });
        }
        executorService.shutdown();
    }
}
