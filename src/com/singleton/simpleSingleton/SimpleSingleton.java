package com.singleton.simpleSingleton;

/**
 * @Author: by Administrator on 2018/3/8.
 */
public class SimpleSingleton {
    private static SimpleSingleton simpleSingleton = null;
    private SimpleSingleton(){
    }
    public static SimpleSingleton getInstance(){
        if (simpleSingleton == null){
            simpleSingleton = new SimpleSingleton();
        }
        return simpleSingleton;
    }
}
