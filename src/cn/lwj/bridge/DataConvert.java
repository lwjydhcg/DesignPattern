package cn.lwj.bridge;

/**
 * Created by Administrator on 2018-01-20.
 * 数据转换
 */
abstract class DataConvert {

    protected DbRead dbRead;

    public void setDbRead(DbRead dbRead) {
        this.dbRead = dbRead;
    }

    abstract void conbvert();
}

class TxtDataConvert extends DataConvert {

    @Override
    void conbvert() {
        String data = dbRead.read();
        System.out.println(data);
        System.out.println("Data Text convert");
    }
}

class XmlDataConvert extends DataConvert {

    @Override
    void conbvert() {
        String data = dbRead.read();
        System.out.println(data);
        System.out.println("Data Xml convert");
    }
}

class PdfDataConvert extends DataConvert {

    @Override
    void conbvert() {
        String data = dbRead.read();
        System.out.println(data);
        System.out.println("Data Pdf convert");
    }
}