package cn.lwj.singleton;

/**
 * Created by Administrator on 2018-01-12.
 * 懒汉式单例模式
 */
public class LanhanPattern {
    public volatile static LanhanPattern instance;

    private LanhanPattern() {

    }

    public static LanhanPattern getInstance() {
        if (instance == null) {
            synchronized (LanhanPattern.class) {
                if (instance == null) {
                    instance = new LanhanPattern();
                }
            }
        }
        return instance;
    }

}
