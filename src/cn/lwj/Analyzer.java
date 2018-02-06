package cn.lwj;

import java.util.*;

/**
 * Created by Administrator
 * 传播分析逻辑：两个set保持model, 双层遍历一个set，找出遍历对象的上一级，remove掉另一个set的当前对象。
 * 另一个set最终剩下来就是没有上一级传播的节点，全部设为根节点的子节点。
 * 2018-02-03.
 */
public class Analyzer {
    public static void main(String[] args) {
        Set<Model> models = demoData();
        Set<Model> totals = new HashSet<>(models);

        for (Model temp : totals) {
            totals.stream().filter(temp2 -> temp.source.equals(temp2.origin)).forEach(temp2 -> {
                temp2.childs.add(temp);
                models.remove(temp);
            });
        }
        Model start = new Model("start", "start");
        start.childs = models;
        System.out.println(start);
    }


    private static Set<Model> demoData() {
        Set<Model> models = new HashSet<>();
        models.add(new Model("大众网", "央视网"));
        models.add(new Model("央视网", "大河网"));
        models.add(new Model("大河网", "河南日报"));
        models.add(new Model("中新网", "中青网"));
        return models;
    }
}

class Model {
    String origin;
    String source;
    Set<Model> childs = new HashSet<>();

    Model(String origin, String source) {
        this.source = source;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Model{" +
                "origin='" + origin + '\'' +
                ", source='" + source + '\'' +
                ", childs=" + childs +
                '}';
    }
}