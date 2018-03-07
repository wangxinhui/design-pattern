package com.simpleFactory.practice;

/**
 * @Author: by Administrator on 2018/3/6.
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("draw a square");
    }

    @Override
    public void erase() {
        System.out.println("erase a square");
    }
}
