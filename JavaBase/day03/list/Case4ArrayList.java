package JavaBase.day03.list;

import java.util.ArrayList;

/**
 * 需求：创建一个存储String的集合
 * 删除所有的test字符串，删除后打印集合
 *
 * @author qilin
 */
public class Case4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("test");
        list.add("123");
        list.add("test");

        // 只删除一个 test
        // list.remove("test");

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if ("test".equals(list.get(i))) {
                list.remove(i);
                i--;
            }
        }
    }
}
