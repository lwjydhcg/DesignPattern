package cn.lwj.prototype;

/**
 * Created by Administrator on 2018-01-12.
 */
interface OfficialDocument extends Cloneable{
    OfficialDocument clone();

    void display();
}

class FAR implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (OfficialDocument) object;
    }

    @Override
    public void display() {
        System.out.println("FAR display ...");
    }
}

class SRS implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (OfficialDocument) object;
    }

    @Override
    public void display() {
        System.out.println("SRS display ...");
    }
}