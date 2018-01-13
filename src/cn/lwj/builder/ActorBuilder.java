package cn.lwj.builder;

/**
 * Created by Administrator on 2018-01-13.
 * 抽象建造者
 */
abstract class ActorBuilder {
    protected Actor actor = new Actor();

    abstract void buildType();

    abstract void buildSex();

    abstract void buildFace();

    abstract void buildCostume();

    abstract void buildHairStyle();

    Actor createActor() {
        return actor;
    }
}
