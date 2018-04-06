package com.compositePattern.practice;

public class Client {
    public static void main(String[] args) {
        AbstractInterfaceController c1,c2,c3,e1,e2,e3,e4,e5,e6;
        c1 = new ControllerContainer("A");
        c2 = new ControllerContainer("B");
        c3 = new ControllerContainer("C");
        e1 = new ButtonElement("b1");
        e2 = new InputElement("I1");
        e3 = new InputElement("I2");
        e4 = new SelectElement("S1");
        e5 = new SelectElement("S2");
        e6 = new SelectElement("S3");
        c1.add(e1);
        c1.add(e2);
        c1.add(e3);
        c2.add(e4);
        c2.add(e5);
        c2.add(e6);
        c3.add(c1);
        c3.add(c2);
        c3.show();

    }
}
