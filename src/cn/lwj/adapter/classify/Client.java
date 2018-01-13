package cn.lwj.adapter.classify;

/**
 * Created by Administrator on 2018-01-13.
 * 类适配器模式
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
