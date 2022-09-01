package JavaBase.day12.StreamTest;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Stream<T> filter(Predicate predicate)：用于对流中的数据进行过滤
 * Predicate接口中的方法
 * boolean test(T t):对给定的参数进行判断，返回一个布尔值
 * Stream<T> limit(long maxSize)：截取指定参数个数的数据
 * 截取前 maxSize 个参数
 * Stream<T> skip(long n)：跳过指定参数个数的数据
 * static <T> Stream<T> concat(Stream a, Stream b)：合并a，b两个为一个流
 * Stream<T> distinct()：去除流中重复元素。依赖hashCode和equals方法
 *
 * @author qilin
 */
public class StreamTest4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("二麻子");
        list.add("张良");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("谢广坤");
        // Stream<T> limit(long maxSize)：截取指定参数个数的数据
        // 保留前面的数据
        Stream<String> limit = list.stream().limit(3);
        limit.forEach(System.out::println);

        // Stream<T> skip(long n)：跳过指定参数个数的数据
        Stream<String> skip = list.stream().skip(3);
        skip.forEach(System.out::println);

        System.out.println("---------------------------------");
        // static <T> Stream<T> concat(Stream a, Stream b)：合并a，b两个为一个流
        // Stream<String> concat = Stream.concat(list.stream(), list.stream());
        // concat.forEach(System.out::println);

        System.out.println("---------------------------------");
        // Stream<T> distinct()：去除流中重复元素。依赖hashCode和equals方法
        list.stream().distinct().forEach(System.out::println);
    }
}
