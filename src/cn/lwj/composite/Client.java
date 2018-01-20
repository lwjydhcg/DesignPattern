package cn.lwj.composite;

/**
 * Created by Administrator on 2018-01-20.
 */
public class Client {
    public static void main(String[] args) {
        AbstractControl button1 = new Button();
        AbstractControl text1 = new Text();
        AbstractControl frame = new FrameControl();
        AbstractControl panel = new PanelControl();
        frame.add(button1);
        frame.add(text1);
        panel.add(text1);
        frame.display();
        panel.display();
    }
}
