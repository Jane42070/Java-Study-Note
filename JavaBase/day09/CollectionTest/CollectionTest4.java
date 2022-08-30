package JavaBase.day09.CollectionTest;

import java.util.ArrayList;

/**
 * @author qilin
 */
public class CollectionTest4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
