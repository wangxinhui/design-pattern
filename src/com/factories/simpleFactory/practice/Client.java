package com.factories.simpleFactory.practice;

/**
 * @Author: by Administrator on 2018/3/6.
 */
public class Client {
    public static void main(String[] args) throws UnsupportedShapeException {
        Shape shape ;
        shape = ShapeFactory.productShape("0000");
        shape.draw();
    }
}
