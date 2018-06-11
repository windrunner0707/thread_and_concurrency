package com.baiqiqi.thread_and_concurrency.example.sync;

/**
 * synchronized修饰的静态方法锁定的是这个类的所有对象。
 */
public class SyncExample5 implements Runnable{

    private static int count;

    public SyncExample5() {
        count = 0;
    }

    public synchronized static void method() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public synchronized void run() {
        method();
    }
}
