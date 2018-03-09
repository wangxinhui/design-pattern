package com.factories.abstractFactory;

/**
 * @Author: by Administrator on 2018/3/8.
 */
public class SpringButton implements Button{
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}
