package JavaBase.day12.StreamTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个集合，并添加一些整数1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 * 将集合中的奇数删除，只保留偶数
 * 遍历集合得到2, 4, 6, 8, 10
 *
 * @author qilin
 */
public class StreamTest6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
    }
}
