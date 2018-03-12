package com.singleton.eagerAndLazy;

/**
 * @Author: by Administrator on 2018/3/12.
 * 假如在某一瞬间线程A和线程B都在调用getInstance()方法，此时instance对象为null值，均能通
 * 过instance == null的判断。由于实现了synchronized加锁机制，线程A进入synchronized锁定的代
 * 码中执行实例创建代码，线程B处于排队等待状态，必须等待线程A执行完毕后才可以进入synchronized锁定代码。
 * 但当A执行完毕时，线程B并不知道实例已经创建，将继续创建新的实例，导致产生多个单例对象，违背单例模式的设计思想
 */
public class LazySingleton2 {
    private static LazySingleton2 instance = null;
    private LazySingleton2(){

    }
    public static LazySingleton2 getInstance(){
        if (instance == null){
            synchronized (LazySingleton2.class){
                instance = new LazySingleton2();
            }
        }
        return instance;
    }
}
