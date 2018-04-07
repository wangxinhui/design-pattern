package com.DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        Component c3,c1,c2;
        c3 = new ListBox();
        c1 = new BlackBorderDecorator(c3);
        c2 = new ScrollBarDecorator(c3);
        c2.display();
        c1.display();
        c3.display();
    }
}
