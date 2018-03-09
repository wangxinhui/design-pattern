package com.factories.abstractFactory;

/**
 * @Author: by Administrator on 2018/3/8.
 */
public class SpringTextField implements TextField{
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}
