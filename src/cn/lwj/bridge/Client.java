package cn.lwj.bridge;

/**
 * Created by Administrator on 2018-01-20.
 * 桥接模式
 */
class Client {
    public static void main(String[] args) {
        DbRead dbRead = new MySQLDbRead();
        DataConvert dataConvert = new TxtDataConvert();
        dataConvert.setDbRead(dbRead);
        dataConvert.conbvert();
    }

}
