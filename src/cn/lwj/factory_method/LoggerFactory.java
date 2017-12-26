package cn.lwj.factory_method;

/**
 * Created by Administrator on 2017-12-26.
 */
public abstract class LoggerFactory {
    void writeLog() {
        Logger logger = createLogger();
        logger.writeLog();
    }

    abstract Logger createLogger();
}

class FileLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}

class DatabaseLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
