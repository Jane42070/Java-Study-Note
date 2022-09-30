package JavaBase.day12.StreamTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 体验Stream流
 * 创建一个集合，存储多个字符串元素
 * "张三丰"，"张无忌"，"张翠山"，"王二麻子"，"张良"，"谢广坤"
 * 把集合中所有以"张"开头的元素存到一个新的集合
 * 把集合中所有以"张"开头，长度为3的元素存储到一个新的集合
 * 遍历上一步得到的集合
 *
 * @author qilin
 */
public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("张三丰", "张无忌", "张翠山", "王二麻子", "张良", "谢广坤"));
        // 普通方法
        normalMethod(list);

        // Stream 流体验
        streamMethod(list);
    }

    private static void streamMethod(ArrayList<String> list) {
        list.stream().filter(
                s -> s.startsWith("张")).filter(
                s -> s.length() == 3).forEach(
                System.out::println);
    }

    private static void normalMethod(ArrayList<String> list) {
        // 集合的批量添加
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        for (String s : list) {
            if (s.startsWith("张")) {
                list2.add(s);
                if (s.length() == 3) {
                    list3.add(s);
                }
            }
        }

        System.out.println(list2);
        System.out.println(list3);
    }
}
