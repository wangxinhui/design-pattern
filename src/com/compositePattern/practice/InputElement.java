package com.compositePattern.practice;

public class InputElement extends AbstractInterfaceController{
    private String name;

    public InputElement(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractInterfaceController interfaceController) {
        System.out.println("the input can't add child");
    }

    @Override
    public void show() {
        System.out.println("loading " + name + " input element.");
    }
}
