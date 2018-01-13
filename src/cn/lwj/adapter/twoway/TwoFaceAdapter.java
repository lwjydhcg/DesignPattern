package cn.lwj.adapter.twoway;

/**
 * Created by Administrator on 2018-01-13.
 */
public class TwoFaceAdapter implements IWolf, ISheep {
    private ISheep sheep;
    private IWolf wolf;

    public TwoFaceAdapter(IWolf wolf) {
        this.wolf = wolf;
    }

    public TwoFaceAdapter(ISheep sheep) {
        this.sheep = sheep;
    }


    @Override
    public void eatMeat() {
        sheep.eatGrass();
    }

    @Override
    public void eatGrass() {
        wolf.eatMeat();
    }
}
