package cn.lwj.simple_factory;

/**
 * Created by Administrator on 2017-12-26.
 */
public abstract class Product {
    abstract void display();
}

class ProductA extends Product {

    @Override
    void display() {
        System.out.println("ProductA is displaying ...");
    }
}
class ProductB extends Product{

    @Override
    void display() {
        System.out.println("ProductB is displaying ...F");
    }
}
