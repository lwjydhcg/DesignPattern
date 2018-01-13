package cn.lwj.adapter.object;

/**
 * Created by Administrator on 2018-01-13.
 * 二分查找法：前提array数组必须是排过序的
 */
public class BinarySearch {
    public int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (array[mid] > key) {
                high -= 1;
            } else if (array[mid] < key) {
                low += 1;
            } else {
                return 1;
            }
        }
        return -1;
    }
}
