package cn.lwj.mediator;

/**
 * Created by Administrator
 * 2018-02-06.
 */
abstract class Mediator {
    abstract void componentChanged(Component component);
}

class ConcreteMediator extends Mediator {
    List list;
    Button button;
    ComboBox comboBox;

    @Override
    void componentChanged(Component component) {
        if (component == button) {
            System.out.println("添加按钮");
            button.add();
        }else if (component == comboBox){
            System.out.println("从组合框选择客户");
            comboBox.select();
        }
    }
}
