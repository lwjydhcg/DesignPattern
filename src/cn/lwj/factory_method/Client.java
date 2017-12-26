package cn.lwj.factory_method;

/**
 * Created by Administrator on 2017-12-26.
 * 工厂方法模式
 */
public class Client {

    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();
        factory.writeLog();
    }
}
