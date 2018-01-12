package cn.lwj.Prototype;


/**
 * Created by Administrator on 2018-01-12.
 */
class Client {
    public static void main(String[] args) {
        PrototypeManager manager = PrototypeManager.getInstance();
        manager.addOfficialDocument("far", new FAR());
        manager.addOfficialDocument("srs", new SRS());
        OfficialDocument doc1 = manager.getOfficialDocument("far");
        OfficialDocument doc2 = manager.getOfficialDocument("far");
        System.out.println(doc1 == doc2);
        OfficialDocument doc3 = manager.getOfficialDocument("srs");
        OfficialDocument doc4 = manager.getOfficialDocument("srs");
        System.out.println(doc3 == doc4);
    }
}