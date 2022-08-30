package JavaBase.day09.ListTest;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author qilin
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
