package JavaBase.day12.StreamTest;

import java.util.*;
import java.util.stream.Stream;

/**
 * Stream 流的获取
 * 单列集合：集合对象.stream()
 * 双列集合：不能直接获取，需间接获取
 * 集合对象.keySet().stream()
 * 集合对象.entrySet().stream()
 * 同种数据类型的多个数据
 * Stream.of(数据1, 数据2, 数据3...)
 *
 * @author qilin
 */
public class StreamTest2 {
    public static void main(String[] args) {
        // 单列集合
        method1();
        // 双列集合，不能直接获取Stream流
        method2();

        // 数组
        method3();

        // 同种类型多个数据
        method4();
    }

    private static void method4() {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(i -> System.out.println(i));
    }

    private static void method3() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.stream(arr).forEach(i -> System.out.println(i));
    }

    private static void method2() {
        HashMap<String, Integer> map = new HashMap<>(Map.of(
                "zhangsan", 23,
                "lisi", 24,
                "wangwu", 25,
                "zhaoliu", 26
        ));

        // KeySet
        // 获取到所有键，将Set集合中所有键放到Stream流中
        Set<String> stringSet = map.keySet();
        stringSet.stream().forEach(s -> System.out.println(s));

        // EntrySet
        // 获取到所有键值对，将Set集合中所有键值对放到Stream流中
        map.entrySet().stream().forEach(e -> System.out.println(e));
    }

    private static void method1() {
        // 单列
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        list.stream().forEach(s -> System.out.println(s));
    }
}
