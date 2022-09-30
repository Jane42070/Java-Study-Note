package JavaBase.day09.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author qilin
 */
public class CollectionTest3 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        iteratorMethod(list);
    }

    private static void iteratorMethod(Collection<String> list) {
        // 获取迭代器对象
        // 迭代器对象创建后默认指向集合的0索引处
        Iterator<String> iterator = list.iterator();
        // System.out.println(iterator.hasNext());
        // System.out.println(iterator.next());
        while (iterator.hasNext()) {
            // 取出当前位置的元素 + 将迭代器往后移动一个索引位置
            System.out.println(iterator.next());
        }
    }
}
