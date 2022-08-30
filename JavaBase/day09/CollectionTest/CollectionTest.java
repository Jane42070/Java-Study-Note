package JavaBase.day09.CollectionTest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author qilin
 */
public class CollectionTest {
    public static void main(String[] args) {
        // 数组可以存储基本数据类型，也可以存储饮用数据类型
        int[] arr1 = {1, 2, 3};
        String[] arr2 = {"a", "b", "c", "d", "e", "f"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // 集合只能存引用数据类型
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        System.out.println(list1);

        // ArrayList<int> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        System.out.println(list3);
    }
}
