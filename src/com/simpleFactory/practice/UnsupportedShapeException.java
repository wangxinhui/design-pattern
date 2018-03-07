package com.simpleFactory.practice;

/**
 * @Author: by Administrator on 2018/3/6.
 */
public class UnsupportedShapeException extends Exception {

    private static final long serialVerionUID = 1L;

    private String errorCode;

    public UnsupportedShapeException(String message){
        super(message);
    }
}
