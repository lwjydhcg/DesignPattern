package cn.lwj.adapter.twoway;

/**
 * Created by Administrator on 2018-01-13.
 */
interface IWolf {
    void eatMeat();
}

class Wolf implements IWolf {

    @Override
    public void eatMeat() {
        System.out.println("eat meat ...");
    }
}