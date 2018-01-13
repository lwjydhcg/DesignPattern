package cn.lwj.adapter.twoway;

/**
 * Created by Administrator on 2018-01-13.
 * 双向适配器
 */
public class Client {
    public static void main(String[] args) {
        // 把羊适配为狼，吃肉
        TwoFaceAdapter adapter = new TwoFaceAdapter(new Sheep());
        adapter.eatMeat();
        // 把狼适配为羊，吃草
        adapter = new TwoFaceAdapter(new Wolf());
        adapter.eatGrass();
    }
}
