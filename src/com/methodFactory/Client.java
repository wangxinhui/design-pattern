package com.methodFactory;

import org.dom4j.DocumentException;

/**
 * @Author: by Administrator on 2018/3/7.
 */
public class Client {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, DocumentException, IllegalAccessException {
        LoggerFactory loggerFactory = (LoggerFactory) XMLUtil.getBean();
        loggerFactory.writeLog();
    }
}
