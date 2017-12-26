package cn.lwj.simple_factory;

/**
 * Created by Administrator on 2017-12-26.
 * 简单工厂模式
 */
public class Client {

    public static void main(String[] args) {
        Product product = ProductFactory.createProduct("A");
        if (product != null) product.display();
    }
}
