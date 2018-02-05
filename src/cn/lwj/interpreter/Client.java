package cn.lwj.interpreter;

/**
 * Created by Administrator
 * 2018-02-02.
 */
public class Client {
    public static void main(String[] args) {
        InstructionHandler handler = new InstructionHandler();
        handler.handle("up move 5 and down run 10 and left move 5");
        System.out.println(handler.output());
    }
}
