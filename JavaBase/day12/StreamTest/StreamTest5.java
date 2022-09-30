package JavaBase.day12.StreamTest;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * void forEach(Consumer action)：对此流的每个元素执行操作
 * Consumer 接口中的方法 void accept(T t): 对给定的参数执行此操作
 * long count()：返回此流中的元素数
 *
 * @author qilin
 */
public class StreamTest5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("二麻子");
        list.add("张良");
        list.add("谢广坤");

        method1(list);

        long count = list.stream().count();
        System.out.println(count);
    }

    private static void method1(ArrayList<String> list) {
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                if (s.startsWith("张")) {
                    System.out.println(s);
                }
            }
        });

        // Lambda 表达式的简化格式
        // 是因为 Consumer 接口中，只有一个 accept 方法
        list.stream().forEach(s -> System.out.println(s));
    }
}
