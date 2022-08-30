package JavaBase.day03.list;

import java.util.ArrayList;

/**
 * 方法名                             说明
 * public boolean remove(Object c)    删除指定元素,返回是否成功
 * public E remove(int index)         删除指定索引处的元素
 * public E set(int index, E element) 修改指定索引处的元素,返回被修改的元素
 * public E get(int index)            返回指定索引处的元素
 * public int size()                  返回集合中元素的个数
 *
 * @author qilin
 */
public class Demo2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");

        // public boolean remove(Object c)    删除指定元素,返回是否成功
        boolean b1 = list.remove("ABC");
        boolean b2 = list.remove("ZZZ");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(list);

        // public E remove(int index)         删除指定索引处的元素
        String s1 = list.remove(0);
        System.out.println(s1);
        System.out.println(list);

        // public E set(int index, E element) 修改指定索引处的元素,返回被修改的元素
        String s2 = list.set(0, "666");
        System.out.println(s2);
        System.out.println(list);

        // public E get(int index)            返回指定索引处的元素
        String s3 = list.get(0);
        String s4 = list.get(1);
        String s5 = list.get(2);

        System.out.println(s3 + " " + s4 + " " + s5);

        // public int size()                  返回集合中元素的个数
        System.out.println(list.size());
    }
}
