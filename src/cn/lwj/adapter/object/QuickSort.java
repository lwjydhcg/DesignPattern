package cn.lwj.adapter.object;

/**
 * Created by Administrator on 2018-01-13.
 * 适配者：快速排序
 * 算法思想：分治法
 * 采用了递归方法，每次partition方法讲array[r]作为基准，
 * 以此基准将数组分成左右两个区间，而此基准位于正确的位置上，
 * 再然后将左右两个区间分别递归处理。
 */
public class QuickSort {

    public int[] quickSort(int[] array) {
        sort(array, 0, array.length - 1);
        return array;
    }

    public void sort(int[] array, int p, int r) {
        int q;
        if (p < r) {
            q = partition(array, p, r);
            sort(array, p, q - 1);
            sort(array, q + 1, r);
        }
    }

    public int partition(int[] array, int p, int r) {
        int x = array[r];
        int j = p - 1;
        for (int i = p; i <= r - 1; i++) {
            if (array[i] <= x) {
                j++;
                swap(array, j, i);
            }
        }
        swap(array, j + 1, r);
        return j + 1;
    }

    public void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
