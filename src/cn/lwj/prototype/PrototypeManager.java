package cn.lwj.prototype;

import java.util.Hashtable;

/**
 * Created by Administrator on 2018-01-12.
 */
class PrototypeManager {
    private Hashtable ht = new Hashtable();
    private static PrototypeManager instance = new PrototypeManager();

    private PrototypeManager() {

    }

    public static PrototypeManager getInstance() {
        return instance;
    }

    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument) ht.get(key)).clone();
    }
}
