package com.factories.abstractFactory;

import org.dom4j.DocumentException;
import org.dom4j.Text;

/**
 * @Author: by Administrator on 2018/3/8.
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, DocumentException, IllegalAccessException {
        SkinFactory skinFactory ;
        Button button ;
        ComboBox comboBox;
        TextField textField;
        skinFactory = (SkinFactory) XMLUtil.getBean();
        button = skinFactory.createButton();
        comboBox = skinFactory.createComboBox();
        textField = skinFactory.createTextField();
        button.display();
        comboBox.display();
        textField.display();
    }
}
