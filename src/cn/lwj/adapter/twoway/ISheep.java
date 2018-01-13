package cn.lwj.adapter.twoway;

/**
 * Created by Administrator on 2018-01-13.
 */
interface ISheep {
    void eatGrass();
}

class Sheep implements ISheep {

    @Override
    public void eatGrass() {
        System.out.println("eat grass");
    }
}