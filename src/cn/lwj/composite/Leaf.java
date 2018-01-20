package cn.lwj.composite;

/**
 * Created by Administrator on 2018-01-20.
 */
class Button extends AbstractControl {

    @Override
    void display() {
        System.out.println("Button display");
    }
}

class Text extends AbstractControl {

    @Override
    void display() {
        System.out.println("Text display");
    }
}
