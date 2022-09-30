package JavaBase.day11.HashSetTest;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author qilin
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add("b");
        set.add("c");
        set.add("d");

        System.out.println(set);

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------------------------");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
