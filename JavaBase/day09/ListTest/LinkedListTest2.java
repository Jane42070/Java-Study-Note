package JavaBase.day09.ListTest;

import java.util.LinkedList;

/**
 * @author qilin
 */
public class LinkedListTest2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        // public void addFirst(E e) 开头插入指定元素
        method1(list);

        // public void addLast(E e) 末尾插入指定元素
        method2(list);

        // public E getFirst() 返回列表中第一个元素
        method3(list);

        // public E getLast() 返回列表中最后一个元素
        method4(list);

        // public E removeFirst(E e) 删除并返回第一个元素
        method5(list);

        // public E removeLast(E e) 删除并返回最后一个元素
        method6(list);
    }

    private static void method6(LinkedList<String> list) {
        System.out.println(list.removeLast());
    }

    private static void method5(LinkedList<String> list) {
        System.out.println(list.removeFirst());
    }

    private static void method4(LinkedList<String> list) {
        System.out.println(list.getLast());
    }

    private static void method3(LinkedList<String> list) {
        System.out.println(list.getFirst());
    }

    private static void method2(LinkedList<String> list) {
        list.addLast("99");
        System.out.println(list);
    }

    private static void method1(LinkedList<String> list) {
        list.addFirst("00");
        System.out.println(list);
    }
}
