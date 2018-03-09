package com.factories.methodFactory;

/**
 * @Author: by Administrator on 2018/3/7.
 */
public class FileFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }
}
