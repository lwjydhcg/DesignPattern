package cn.lwj.abstract_factory;


/**
 * Created by Administrator on 2018-01-12.
 */
abstract class SkinFactory {

    abstract Button createButton();

    abstract TextField createTextField();

    abstract ComboBox createComboBox();
}

class SpringSkinFactory extends SkinFactory {

    @Override
    Button createButton() {
        return new SpringButton();
    }

    @Override
    TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    ComboBox createComboBox() {
        return new SpringComboBox();
    }
}

class SummeSkinFactory extends SkinFactory {

    @Override
    Button createButton() {
        return new SummerButton();
    }

    @Override
    TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    ComboBox createComboBox() {
        return new SummerComboBox();
    }
}