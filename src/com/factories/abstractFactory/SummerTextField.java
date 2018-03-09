package com.factories.abstractFactory;

/**
 * @Author: by Administrator on 2018/3/8.
 */
public class SummerTextField implements TextField{
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}
