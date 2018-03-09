package com.factories.abstractFactory;

/**
 * @Author: by Administrator on 2018/3/8.
 */
public interface SkinFactory {
     Button createButton();
     TextField createTextField();
     ComboBox createComboBox();
}
