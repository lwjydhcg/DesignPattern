package cn.lwj.decorator;

/**
 * Created by Administrator on 2018-01-22.
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Encryption entry = new BaseShiftEncryption();
        entry = new ReverseEntryption(entry);
        System.out.println(entry.encryption("qwertyuio"));
        entry = new GetlongEntryption(entry);
        System.out.println(entry.encryption("qwertyuio"));
    }
}
