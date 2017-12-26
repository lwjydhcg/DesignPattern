package cn.lwj.factory_method;

/**
 * Created by Administrator on 2017-12-26.
 */
public abstract class Logger {
    abstract void writeLog();
}

class FileLogger extends Logger {

    @Override
    void writeLog() {
        System.out.println("FileLogger write log ...");
    }
}

class DatabaseLogger extends Logger {

    @Override
    void writeLog() {
        System.out.println("DatabaseLogger write log ...");
    }
}
