package JavaBase.day09.ListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author qilin
 */
public class ListTest {
    public static void main(String[] args) {
        // 多态方式创建
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("================================");

        for (String s : list) {
            System.out.println(s);
        }

    }
}
