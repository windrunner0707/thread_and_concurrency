package com.baiqiqi.thread_and_concurrency.example.singleton;

/**
 * 饿汉模式
 * 单例实例在类装载时进行创建
 */
public class SingletonExample6 {

    private SingletonExample6(){}

    private static SingletonExample6 instance = null;

    static {
        instance = new SingletonExample6();
    }

    public static SingletonExample6 getInstance(){
        return instance;
    }
}
