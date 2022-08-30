package JavaBase.day10.TreeSetTest;

import java.util.TreeSet;

/**
 * 需求：选择自然排序和比较器排序两种方式
 * 要求：存入字符串"c","ab","df","qwer"
 * 按照长度排序，如果一样长则按照字母排序
 *
 * @author qilin
 */
public class TreeSetTest5 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>((o1, o2) -> {
            int result = o1.length() - o2.length();
            result = result == 0 ? o1.compareTo(o2) : result;
            return result;
        });

        set.add("c");
        set.add("ab");
        set.add("df");
        set.add("qwer");

        System.out.println(set);
    }
}
