package cn.lwj.abstract_factory;

/**
 * Created by Administrator
 * 2018-01-10.
 */
abstract class Button {
    abstract void display();
}

class SpringButton extends Button {

    @Override
    void display() {
        System.out.println("Spring Button Display");
    }
}

class SummerButton extends Button {

    @Override
    void display() {
        System.out.println("Summer Button Disyplay");
    }
}