package JavaBase.day08.ArraysTest;

import java.util.Arrays;

/**
 * @author qilin
 */
public class ArraysTest {
    public static void main(String[] args) {
        // 返回制定数组的内容的字符串表示形式
        // public static String toString(int[] a);
        int[] arr = {3, 2, 4, 6, 7};
        System.out.println(Arrays.toString(arr));
        // 按照数字顺序排列指定的数组
        // public static void sort(int[] a);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // 利用二分查找返回指定元素的索引
        // public static int binarySearch(int[] a, int key);
        // 1. 数组必须有序
        // 2. 如果要查找的元素存在，那么返回的是这个元素实际的索引
        // 3. 如果要查找的元素不存在，那么返回的是 -插入点 -1
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(arr1, 0);
        System.out.printf("%d", index);
    }
}
