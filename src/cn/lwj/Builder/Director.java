package cn.lwj.Builder;

/**
 * Created by Administrator on 2018-01-13.
 */
public class Director {

    Actor getResult(ActorBuilder builder) {
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();
        builder.buildHairStyle();
        builder.buildType();
        return builder.createActor();
    }
}
