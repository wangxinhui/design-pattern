package com.factories.simpleFactory.practice;

/**
 * @Author: by Administrator on 2018/3/6.
 */
public class ShapeFactory {
    public static Shape productShape(String type) throws UnsupportedShapeException {
        Shape shape = null;
        if (type.equalsIgnoreCase("circle")){
            shape = new Circle();
        }else if (type.equalsIgnoreCase("square")){
            shape = new Square();
        }else if (type.equalsIgnoreCase("triangle")){
            shape = new Triangle();
        }else {
            throw new UnsupportedShapeException("the shape is not exist");
        }
        return shape;

    }
}
