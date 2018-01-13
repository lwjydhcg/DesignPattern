package cn.lwj.adapter.object;

import java.util.Arrays;

/**
 * Created by Administrator on 2018-01-13.
 * 对象适配器模式
 */
class Client {
    public static void main(String[] args) {
        ScoreOperation operation = new OperationAdapter();
        int[] array = {84, 76, 50, 69, 90, 91, 88, 96};
        operation.sort(array);
        Arrays.stream(array).forEach(value -> System.out.println(value));
        System.out.println(operation.search(array, 88));
    }
}
