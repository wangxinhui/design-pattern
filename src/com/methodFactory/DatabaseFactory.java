package com.methodFactory;

/**
 * @Author: by Administrator on 2018/3/7.
 */
public class DatabaseFactory extends LoggerFactory{
    @Override
    public Logger createLogger() {
        Logger logger = new DataBaseLogger();
        return logger;

    }
}
