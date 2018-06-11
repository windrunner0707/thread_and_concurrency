package com.baiqiqi.thread_and_concurrency.example.sync;

public class Main {
    public static void main(String[] args) {

        //1.线程1占有锁，线程2阻塞，当线程1sleep的时候，线程2获得锁开始运行
/*
        SyncExample1 syncExample1 = new SyncExample1();
        Thread thread1 = new Thread(syncExample1,"thread1");
        Thread thread2 = new Thread(syncExample1,"thread2");
        thread1.start();
        thread2.start();
*/

        //2.错误用法:创建了2个对象，这时会有2把锁分别锁定1和2，两把锁互不干扰
/*        Thread thread1 = new Thread(new SyncExample1(), "Thread1");
        Thread thread2 = new Thread(new SyncExample1(), "Thread2");
        thread1.start();
        thread2.start();*/

        //3.上面代码中countAdd是一个synchronized的，printCount是非synchronized的。
        //从上面的结果中可以看出一个线程访问一个对象的synchronized代码块时，别的线程可以访问该对象的非synchronized代码块而不受阻塞
/*        SyncExample2 syncExample2 = new SyncExample2();
        Thread thread1 = new Thread(syncExample2, "A");
        Thread thread2 = new Thread(syncExample2, "B");
        thread1.start();
        thread2.start();*/

        //4.锁定对象的例子
/*        SyncExample3.Account account = new SyncExample3.Account("zhang san", 10000.0f);
        SyncExample3.AccountOperator accountOperator = new SyncExample3.AccountOperator(account);

        final int THREAD_NUM = 5;
        Thread threads[] = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i ++) {
            threads[i] = new Thread(accountOperator, "Thread" + i);
            threads[i].start();
        }*/

        //5.Example5锁定了一个静态方法，这个类的所有对象都可以被锁定，参考对比上面的例子2
        Thread thread1 = new Thread(new SyncExample5(), "Thread1");
        Thread thread2 = new Thread(new SyncExample5(), "Thread2");
        thread1.start();
        thread2.start();

        //6.synchronized(类名.class)锁定一个类,效果与上个例子相同
    }
}
