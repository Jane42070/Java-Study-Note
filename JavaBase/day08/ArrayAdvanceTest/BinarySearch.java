package JavaBase.day08.ArrayAdvanceTest;

/**
 * 二分查找代码实现
 * @author qilin
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int number = 3;

        int index = binarySearchIndex(arr, number);
        System.out.println(index);
    }

    private static int binarySearchIndex(int[] arr, int number) {
        // 定义查找范围
        int min = 0;
        int max = arr.length - 1;
        int index= -1;
        // 循环查找
        while (min <= max) {
            // 计算出中间位置 mid
            // int mid = (max + min) / 2;
            int mid = (max + min) >> 1;
            // mid 指向的元素 < number
            if (number < arr[mid]) {
                // 表示要查找的元素在左边
                max = mid - 1;
            } else if (number > arr[mid]) {
                // 要查找的元素在右边
                min = mid + 1;
            } else {
                index = mid;
                // 打破循环
                break;
            }
        }
        return index;
    }
}
