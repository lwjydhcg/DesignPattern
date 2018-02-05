package cn.lwj.context_interperter;

/**
 * Created by Administrator
 * 2018-02-05.
 * 上下文解释器模式
 */
public class Client {

    public static void main(String[] args) {
        String expression = "LOOP 2 LOOP 2 PRINT" +
                " 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉 BREAK END";
//        String expression = "LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉";
        Context context = new Context(expression);
        Node node = new ExpressionNode();
        node.interperter(context);
        node.execute();
    }
}
