package cn.lwj.singleton;

/**
 * Created by Administrator on 2018-01-12.
 * 饿汉式单例模式
 */
public class EhanPattern {

    public static EhanPattern instance = new EhanPattern();

    private EhanPattern() {

    }

    public static EhanPattern getInstance() {
        return instance;
    }
}
