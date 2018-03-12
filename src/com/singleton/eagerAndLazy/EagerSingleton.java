package com.singleton.eagerAndLazy;

/**
 * @Author: by Administrator on 2018/3/12.
 * 饿汉式方法
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){
        System.out.println("哈哈，我很饿的");
    }
    public static EagerSingleton getInstance(){
        return instance;
    }

    public void display(){
        System.out.println("饿汉显示");
    }
}
