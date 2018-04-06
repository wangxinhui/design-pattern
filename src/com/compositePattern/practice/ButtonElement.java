package com.compositePattern.practice;

public class ButtonElement extends AbstractInterfaceController{
    private String name;

    public ButtonElement(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractInterfaceController interfaceController) {
        System.out.println("the button can't add child");
    }

    @Override
    public void show() {
        System.out.println("loading " + name + " button element.");
    }
}
