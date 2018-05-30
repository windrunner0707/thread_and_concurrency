package com.baiqiqi.thread_and_concurrency.example.threadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 缓存线程池
 * lambda表达式写法
 * CachedThreadPool是大小无界的线程池,适用于执行很多的短期异步任务的小程序,或者
 * 是负载较轻的服务器。
 */
@Slf4j
public class ThreadPoolExample1 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            executorService.execute(() ->{
                log.info("task:{}",index);
            });
        }
        executorService.shutdown();
    }
}
