package JavaBase.day10.GenericSummarize;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author qilin
 */
public class GenericSummarize {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            // it.next().length();
            System.out.println(it.next());
        }
    }
}
