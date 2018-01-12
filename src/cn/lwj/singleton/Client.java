package cn.lwj.singleton;

/**
 * Created by Administrator on 2018-01-12.
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(IoDHPattern.getInstance());
        System.out.println(EhanPattern.getInstance());
        System.out.println(LanhanPattern.getInstance());
    }
}
