package com.prototypePattern.prototype;

public class FAR implements OfficalDocument{
    @Override
    public OfficalDocument clone() {
        try {
            return (OfficalDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void display() {
        System.out.println("far is display");
    }
}
