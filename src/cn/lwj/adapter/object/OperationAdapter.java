package cn.lwj.adapter.object;

/**
 * Created by Administrator on 2018-01-13.
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort sortObj;
    private BinarySearch searchObj;

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        sortObj.quickSort(array);
        return array;
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
