package JavaBase.day10.TreeSetTest;

/**
 * @author qilin
 */
public class TreeSetTest3 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "ab";

        System.out.println(s1.compareTo(s2));
        // 先比较第一个字母，如果一样，则比较后面的字母
        // ASCII characters 比较，a比b小，放左边
    }
}
