package com.singleton.eagerAndLazy;

/**
 * @Author: by Administrator on 2018/3/12.
 */
public class EagerTest {
    public static void main(String[] args) {
       EagerSingleton eagerSingleton = EagerSingleton.getInstance();
       eagerSingleton.display();
    }
}
