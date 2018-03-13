package com.prototypePattern.prototype;

/**
 * 原型模式
 */
public interface OfficalDocument extends Cloneable {
    OfficalDocument clone();

    void display();
}
