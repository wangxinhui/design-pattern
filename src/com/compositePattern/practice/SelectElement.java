package com.compositePattern.practice;

public class SelectElement extends AbstractInterfaceController{
    private String name;

    public SelectElement(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractInterfaceController interfaceController) {
        System.out.println("the select can't add child");
    }

    @Override
    public void show() {
        System.out.println("loading " + name + " select element.");
    }
}
