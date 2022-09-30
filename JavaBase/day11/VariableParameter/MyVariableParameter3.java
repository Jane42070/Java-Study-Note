package JavaBase.day11.VariableParameter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author qilin
 */
public class MyVariableParameter3 {
    public static void main(String[] args) {
        // static <E> List<E> of(E...elements)      | 创建一个具有指定元素的List对象 |
        // static <E> Set<E> of(E...elements)       | 创建一个具有指定元素的Set对象  |
        // static <K, V> Map<K, V> of(E...elements) | 创建一个具有指定元素的Map对象  |
        // 集合的批量添加
        // 首先是通过调用List.of方法来创建一个不可变得集合 of方法的形参就是一个可变参数
        ArrayList<String> list = new ArrayList<>(List.of("a", "b", "c"));
        System.out.println(list);

        Set<String> set = Set.of("a", "b", "c");
        System.out.println(set);

        Map<String, String> map = Map.of("a", "1", "b", "2", "c", "3");
        System.out.println(map);

        Map<String, String> map1 = Map.ofEntries(
                Map.entry("a", "1"),
                Map.entry("b", "2"),
                Map.entry("c", "3")
        );
        System.out.println(map1);
        /*
                List<String> a = List.of("a", "b", "c");
                System.out.println(a);
                System.out.println(a.add("a"));
                a.set(0, "z");
                System.out.println(a);
                a.remove("a");
                System.out.println(a);
        */
    }
}
