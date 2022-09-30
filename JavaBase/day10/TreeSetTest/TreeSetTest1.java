package JavaBase.day10.TreeSetTest;

import java.util.TreeSet;

/**
 * TreeSet 集合存储Integer类型
 *
 * @author qilin
 */
public class TreeSetTest1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(4);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println(set);
    }
}
