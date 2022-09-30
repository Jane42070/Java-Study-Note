package JavaBase.day08.ArrayAdvanceTest;

/**
 * 冒泡排序
 *
 * @author qilin
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        // 1 2 3 4 5
        // 把最大值5找出，并把它放到数组的最右边
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] arr) {
        // -1 是为了让索引不超出范围
        // 外层循环控制的是次数，比数组的长度少一次
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环就是实际循环比较的
            // -1 是为了让数组不要越界
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
