package cn.lwj.decorator;

/**
 * Created by Administrator on 2018-01-22.
 */
abstract class AbstractDecorator implements Encryption {

    protected Encryption entry;

    public AbstractDecorator(Encryption entry) {
        this.entry = entry;
    }

    @Override
    public String encryption(String data) {
        return entry.encryption(data);
    }
}

class ReverseEntryption extends AbstractDecorator {

    public ReverseEntryption(Encryption entry) {
        super(entry);
    }

    @Override
    public String encryption(String data) {
        data = super.encryption(data);
        StringBuffer buffer = new StringBuffer();
        for (int i = (data.length() - 1); i >= 0; i--) {
            buffer.append(data.charAt(i));
        }
        return buffer.toString();
    }
}

class GetlongEntryption extends AbstractDecorator {

    public GetlongEntryption(Encryption entry) {
        super(entry);
    }

    @Override
    public String encryption(String data) {
        data = super.encryption(data);
        return data + "abs";
    }
}
