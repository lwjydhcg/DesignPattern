package cn.lwj.mediator;

/**
 * Created by Administrator
 * 2018-02-06.
 */
public class Client {

    public static void main(String[] args) {
        ComboBox combox = new ComboBox();
        Button button = new Button();
        List list = new List();
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.comboBox = combox;
        mediator.button = button;
        mediator.list = list;
        combox.setMediator(mediator);
        button.setMediator(mediator);
        list.setMediator(mediator);
        button.changed();
    }
}
