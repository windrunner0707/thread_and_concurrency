package com.baiqiqi.thread_and_concurrency.example.singleton;


import com.baiqiqi.thread_and_concurrency.annotations.NotThreadSafe;

@NotThreadSafe
public class SingletonExample4 {

    private SingletonExample4(){

    }

    public static SingletonExample4 instance = null;

    // 1、memory = allocate() 分配对象的内存空间
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance指向刚分配的内存

    // JVM和cpu优化，发生了指令重排

    // 1、memory = allocate() 分配对象的内存空间
    // 3、instance = memory 设置instance指向刚分配的内存
    // 2、ctorInstance() 初始化对象

    public static SingletonExample4 getInstance(){
        if(instance == null){
            synchronized (SingletonExample4.class){
                if (instance == null){
                    instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }
}
