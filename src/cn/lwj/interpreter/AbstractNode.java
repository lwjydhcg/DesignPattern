package cn.lwj.interpreter;

/**
 * Created by Administrator
 * 2018-02-02.
 */
abstract class AbstractNode {
    public abstract String interpret();
}

// 非终结符表达式
class AndNode extends AbstractNode {
    private AbstractNode left; //左表达式
    private AbstractNode right; //右表达式

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}

// 简单句子解释：非终结符表达式
class SentenceNode extends AbstractNode {
    private AbstractNode direction;
    private AbstractNode distance;
    private AbstractNode action;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.distance = distance;
        this.action = action;
    }

    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}

class DirectionNode extends AbstractNode {
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        if (direction.equalsIgnoreCase("up")) {
            return "向上";
        } else if (direction.equalsIgnoreCase("down")) {
            return "向下";
        } else if (direction.equalsIgnoreCase("left")) {
            return "向左";
        } else if (direction.equalsIgnoreCase("right")) {
            return "向右";
        } else {
            return "无效指令";
        }
    }
}

class ActionNode extends AbstractNode {
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpret() {
        if (action.equalsIgnoreCase("move")) {
            return "移动";
        } else if (action.equalsIgnoreCase("run")) {
            return "快速移动";
        } else {
            return "无效指令";
        }
    }
}

class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }


    @Override
    public String interpret() {
        return this.distance;
    }
}
