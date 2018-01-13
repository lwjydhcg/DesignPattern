package cn.lwj.Builder;

/**
 * Created by Administrator on 2018-01-13.
 */
public class AngelBuilder extends ActorBuilder {
    @Override
    void buildType() {
        actor.setType("天使");
    }

    @Override
    void buildSex() {
        actor.setSex("女");
    }

    @Override
    void buildFace() {
        actor.setFace("好看");
    }

    @Override
    void buildCostume() {
        actor.setCostume("白裙");
    }

    @Override
    void buildHairStyle() {
        actor.setHairstyle("长发飘飘");
    }
}
