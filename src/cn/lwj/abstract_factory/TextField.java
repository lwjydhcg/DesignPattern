package cn.lwj.abstract_factory;

/**
 * Created by Administrator on 2018-01-12.
 */
abstract class TextField {

    abstract void display();
}

class SpringTextField extends TextField {

    @Override
    void display() {
        System.out.println("Spring TextField Display");
    }
}

class SummerTextField extends TextField {

    @Override
    void display() {
        System.out.println("Summer TextField Display");
    }
}
