package cn.lwj.Builder;

/**
 * Created by Administrator on 2018-01-13.
 * Client
 */
class Client {

    public static void main(String[] args) {
        ActorBuilder builder = new HeroBuilder();
        Actor actor = new Director().getResult(builder);
        System.out.println(actor.getSex());
        System.out.println(actor.getCostume());
        System.out.println(actor.getHairStyle());
    }

}
