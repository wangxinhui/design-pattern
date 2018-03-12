package com.singleton.eagerAndLazy;

/**
 * @Author: by Administrator on 2018/3/12.
 */
public class LazySingleton3 {
    private volatile static LazySingleton3 instance = null;
    private LazySingleton3() {

    }
    public static LazySingleton3 getInstance() {
        if (instance == null) {
            synchronized (LazySingleton3.class) {
                if (instance == null) {
                    instance = new LazySingleton3();
                }
            }
        }
        return instance;
    }
}
