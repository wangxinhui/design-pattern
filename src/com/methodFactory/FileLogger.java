package com.methodFactory;

/**
 * @Author: by Administrator on 2018/3/7.
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("the log write to file.");
    }
}
