package cn.lwj.mediator;

/**
 * Created by Administrator
 * 2018-02-06.
 */
abstract class Component {

    private Mediator mediator;

    void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    void changed() {
        mediator.componentChanged(this);
    }

    abstract void update();
}

class ComboBox extends Component {

    void select() {
        System.out.println("选择客户");
    }

    @Override
    void update() {

    }
}

class Button extends Component {
    void add() {
        System.out.println("添加客户");
    }

    @Override
    void update() {

    }
}


class List extends Component {

    void select(){
        System.out.println("列表框选中一项：小龙女");
    }


    @Override
    void update() {
        System.out.println("列表框增加一项：张无忌");
    }
}