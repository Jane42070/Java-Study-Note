package JavaBase.day09.ListTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qilin
 */
public class ListTest2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        // void add(int index, E element) 指定位置插入元素
        // 原来位置的元素会往后挪
        list.add(0, "666");
        System.out.println(list);
        // E remove(int index) 删除指定索引元素
        // 两个删除方法
        // 第一个删除指定元素，返回是否删除成功
        list.remove("6");
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list);
        // E set(int index, E element) 修改指定索引元素
        System.out.println(list.set(0, "666"));
        System.out.println(list);
        // E get(int index) 返回指定索引处元素
        System.out.println(list.get(0));
    }
}
