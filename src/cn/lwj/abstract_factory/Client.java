package cn.lwj.abstract_factory;

/**
 * Created by Administrator on 2018-01-12.
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory factory = new SpringSkinFactory();
        factory.createButton().display();
        factory.createComboBox().display();
        factory.createTextField().display();
    }
}
