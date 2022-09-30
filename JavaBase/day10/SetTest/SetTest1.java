package JavaBase.day10.SetTest;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author qilin
 */
public class SetTest1 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("3");
        set.add("4");
        set.add("1");
        set.add("1");
        set.add("2");

        for (int i = 0; i < set.size(); i++) {
            // Set 集合没有索引，所以不能使用通过索引获取元素的方法
            // 不能用普通for遍历
        }

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
