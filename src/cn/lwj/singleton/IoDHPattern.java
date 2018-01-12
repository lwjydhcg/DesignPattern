package cn.lwj.singleton;

/**
 * Created by Administrator on 2018-01-12.
 */
public class IoDHPattern {
    private IoDHPattern() {

    }

    public static IoDHPattern getInstance() {
        return HolderClass.instance;
    }

    private static class HolderClass {
        private final static IoDHPattern instance = new IoDHPattern();
    }
}
