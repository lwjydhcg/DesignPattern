package cn.lwj.context_interperter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator
 * 2018-02-05.
 */
abstract class Node {
    abstract void interperter(Context context);

    abstract void execute();
}


class ExpressionNode extends Node {
    List<Node> nodes = new ArrayList<>();


    @Override
    void interperter(Context context) {
        while (context.hasNextToken()) {
            if (context.newToken().equals("END")) {
                break;
            }
            if (context.currentToken().equals("LOOP")) {
                LoopCommandNode node = new LoopCommandNode();
                node.interperter(context);
                nodes.add(node);
            } else {
                PrimitiveNode node = new PrimitiveNode();
                node.interperter(context);
                nodes.add(node);
            }
        }
    }

    @Override
    void execute() {
        nodes.forEach(Node::execute);
    }
}

class LoopCommandNode extends Node {

    // 循环次数
    private int number;
    //
    private ExpressionNode expression;

    @Override
    void interperter(Context context) {
        number = Integer.parseInt(context.newToken());
        expression = new ExpressionNode();
        expression.interperter(context);
    }

    @Override
    void execute() {
        for (int i = 0; i < number; i++) {
            expression.execute();
        }
    }
}

class PrimitiveNode extends Node {
    private String keyword;
    private String text;


    @Override
    void interperter(Context context) {
        this.keyword = context.currentToken();
        if (context.currentToken().equals("PRINT")) {
            this.text = context.newToken();
        }
    }

    @Override
    void execute() {
        if (keyword.equals("BREAK")) {
            System.out.println();
        } else if (keyword.equals("SPACE")) {
            System.out.print(" ");
        } else {
            System.out.print(text);
        }
    }
}