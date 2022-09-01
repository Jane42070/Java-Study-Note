package JavaBase.day12.StreamTest;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author qilin
 */
public class StreamTest3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("二麻子");
        list.add("张良");
        list.add("谢广坤");


        // Stream<T> filter(Predicate predicate)：用于对流中的数据进行过滤
        // list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
        // filter方法获取流中的每一个数据
        // 而 test 方法中的s，就依次表示流中的每一个数据
        // 我们只要在test方法中，对s进行判断，就可以了
        // 如果判断为true，当前的数据留下
        // 如果判断结果为false，则当前数据就不要
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).forEach(s -> System.out.println(s));

        // 因为 Predicate 接口中，只有一个抽象方法 test
        // 所以我们可以使用 Lambda 表达式简化

        list.stream().filter(
                (String s) -> s.startsWith("张")
        ).forEach(s -> System.out.println(s));
    }
}
