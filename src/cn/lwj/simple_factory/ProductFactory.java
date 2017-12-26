package cn.lwj.simple_factory;

/**
 * Created by Administrator on 2017-12-26.
 */
public class ProductFactory {

    static Product createProduct(String arg) {
        System.out.println("Factory start create ...");
        if (arg.equalsIgnoreCase("A")) return new ProductA();
        if (arg.equalsIgnoreCase("B")) return new ProductB();
        return null;
    }

}

