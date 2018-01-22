package cn.lwj.decorator;

/**
 * Created by Administrator on 2018-01-22.
 */
interface Encryption {

    String encryption(String data);
}

class BaseShiftEncryption implements Encryption {

    @Override
    public String encryption(String data) {
        String prefix = data.substring(0, data.length() / 2);
        String suffix = data.substring(data.length() / 2);
        return suffix + prefix;
    }
}