package com.simpleFactory.practice;

/**
 * @Author: by Administrator on 2018/3/6.
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw a circle");
    }

    @Override
    public void erase() {
        System.out.println("erase a circle");
    }
}
