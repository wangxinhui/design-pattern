package com.singleton.eagerAndLazy;

/**
 * @Author: by Administrator on 2018/3/12.
 * 这种方式，在多线程高并发访问环境中，将会导致系统性能大大降低
 */
public class LazySingleton1 {
    private static LazySingleton1 instance = null;
    private LazySingleton1(){

    }
    synchronized public static LazySingleton1 getInstance(){
        if (instance == null){
            instance = new LazySingleton1();
        }
        return instance;
    }
}
