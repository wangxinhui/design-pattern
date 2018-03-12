package com.singleton.IoDH;

public class Singleton {
    private Singleton(){

    }
    private static class HolderClass{
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        Singleton singleton,singleton1;
        singleton = Singleton.getInstance();
        singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
