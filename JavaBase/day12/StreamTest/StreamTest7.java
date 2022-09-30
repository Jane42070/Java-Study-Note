package JavaBase.day12.StreamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author qilin
 */
public class StreamTest7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // filter 负责过滤数据
        // collect 负责收集数据
        // 获取流中的剩余数据，但是他不负责创建容器，也不负责把数据添加到容器中
        // Collectors.toList()：在底层会创建一个List集合，并把所有的数据添加到 List 集合中
        List<Integer> collect = list.stream().filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);
        Set<Integer> set = list.stream().filter(integer -> integer % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
