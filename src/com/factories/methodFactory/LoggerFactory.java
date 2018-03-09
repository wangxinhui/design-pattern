package com.factories.methodFactory;

/**
 * @Author: by Administrator on 2018/3/7.
 */
public abstract class LoggerFactory {

    abstract Logger createLogger();

    void writeLog(){
        Logger logger = this.createLogger();
        logger.writeLog();
    }
}
