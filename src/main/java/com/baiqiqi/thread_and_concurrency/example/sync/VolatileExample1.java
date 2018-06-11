package com.baiqiqi.thread_and_concurrency.example.sync;

public class VolatileExample1 {
    /**
     * 当写一个volatile变量时，JMM会把该线程对应的本地内存中的共享变量值立即刷新到主内存中。
     * 当读一个volatile变量时，JMM会把该线程对应的本地内存设置为无效，直接从主内存中读取共享变量
     *
     * 
     * volatile的用法：
     *
     * 1.volatile用来保证变量的可见性：
     * 当一个变量被volatile修饰后，表示着线程本地内存无效，
     * 当一个线程修改共享变量后他会立即被更新到主内存中，
     * 当其他线程读取共享变量时，它会直接从主内存中读取。
     * 当然，synchronize和锁都可以保证可见性。
     *
     * 2.volatile的原子性；volatile对单个读/写具有原子性（32位Long、Double），但是复合操作除外，例如i++;
     *
     * 3.volatile的有序性防止指令重排序：
     * 在Java内存模型中，为了效率是允许编译器和处理器对指令进行重排序，当然重排序它不会影响单线程的运行结果，但是对多线程会有影响。
     * Java提供volatile来保证一定的有序性。最著名的例子就是单例模式里面的DCL（双重检查锁）。
     *
     * 4.JVM底层采用“内存屏障”来实现volatile语义
     */
}
