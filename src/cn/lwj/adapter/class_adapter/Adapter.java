package cn.lwj.adapter.class_adapter;

/**
 * Created by Administrator on 2018-01-13.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
