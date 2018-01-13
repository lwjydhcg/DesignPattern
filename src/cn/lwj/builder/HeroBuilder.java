package cn.lwj.builder;

/**
 * Created by Administrator on 2018-01-13.
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    void buildType() {
        actor.setType("Hero");
    }

    @Override
    void buildSex() {
        actor.setSex("男");
    }

    @Override
    void buildFace() {
        actor.setSex("帅");
    }

    @Override
    void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    void buildHairStyle() {
        actor.setHairStyle("飘逸");
    }
}
