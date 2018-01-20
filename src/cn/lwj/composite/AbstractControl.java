package cn.lwj.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018-01-20.
 */
abstract class AbstractControl {

    void add(AbstractControl control) {
        throw new UnsupportedOperationException("Object not support add function");
    }

    void remove(AbstractControl control) {
        throw new UnsupportedOperationException("Object not support remove function");
    }

    abstract void display();
}

class FrameControl extends AbstractControl {
    private List<AbstractControl> controlList = new ArrayList<>();

    @Override
    void add(AbstractControl control) {
        controlList.add(control);
    }

    @Override
    void remove(AbstractControl control) {
        controlList.remove(control);
    }

    @Override
    void display() {
        for (AbstractControl control : controlList) {
            control.display();
        }
    }
}

class PanelControl extends AbstractControl {
    private List<AbstractControl> controlList = new ArrayList<>();

    @Override
    void add(AbstractControl control) {
        controlList.add(control);
    }

    @Override
    void remove(AbstractControl control) {
        controlList.remove(control);
    }

    @Override
    void display() {
        for (AbstractControl control : controlList) {
            control.display();
        }
    }
}