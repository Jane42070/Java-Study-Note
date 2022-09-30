package JavaBase.day10.TreeSetTest;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author qilin
 */
public class TreeSetTest4 {
    public static void main(String[] args) {
        TreeSet<Teacher> ts = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                // o1 现在要存入的元素
                // o2 已经存入的元素
                // 主要条件
                int result = o1.getAge() - o2.getAge();
                // 次要条件
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        Teacher t1 = new Teacher("zhangsan", 23);
        Teacher t2 = new Teacher("lisi", 24);
        Teacher t3 = new Teacher("wangwu", 24);
        Teacher t4 = new Teacher("zhaoliu", 24);

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);

        System.out.println(ts);
    }
}
