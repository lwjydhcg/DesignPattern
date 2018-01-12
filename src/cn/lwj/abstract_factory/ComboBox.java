package cn.lwj.abstract_factory;

/**
 * Created by Administrator on 2018-01-12.
 */
abstract class ComboBox {

    abstract void display();
}

class SpringComboBox extends ComboBox {

    @Override
    void display() {
        System.out.println("Spring ComboBox Disyplay");
    }
}

class SummerComboBox extends ComboBox {

    @Override
    void display() {
        System.out.println("Summer ComboBox Display");
    }
}