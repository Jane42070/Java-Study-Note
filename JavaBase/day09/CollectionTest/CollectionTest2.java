package JavaBase.day09.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author qilin
 */
public class CollectionTest2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("44");
        System.out.println(collection);

        boolean result1 = collection.remove("1");
        boolean result2 = collection.remove("1");
        System.out.println(result1);
        System.out.println(result2);

        // 根据条件进行删除
        // removeIf 底层会遍历集合，得到集合中每一个元素
        // s 表示集合中的每一个元素
        // 每一个元素都到lambda表达式判断一下
        // 如果返回 true， 删除， false，则保留不删除
        boolean result3 = collection.removeIf((String s) -> s.length() == 1);
        System.out.println(result3);
        System.out.println(collection);

        // contains(Object o) -> boolean
        // 判断集合中是否存在指定元素
        System.out.println(collection.contains("1"));

        // void clear() 清空集合
        collection.clear();
        System.out.println(collection);

        // isEmpty() -> boolean
        // 判断集合是否为空
        System.out.println(collection.isEmpty());

        // size() -> int
        // 输出集合元素个数
        System.out.println(collection.size());
    }
}
