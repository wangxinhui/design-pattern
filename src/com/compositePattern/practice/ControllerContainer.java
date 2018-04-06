package com.compositePattern.practice;

import java.util.ArrayList;
import java.util.List;

public class ControllerContainer extends AbstractInterfaceController{
    List<AbstractInterfaceController> list = new ArrayList();
    private String name;

    public ControllerContainer(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractInterfaceController interfaceController) {
        list.add(interfaceController);
    }

    @Override
    public void show() {
        System.out.println("loading " + name + " interface controller view.");
        for (AbstractInterfaceController controller : list){
            controller.show();
        }
    }

}
