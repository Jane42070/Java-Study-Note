package JavaBase.day09.CollectionTest;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author qilin
 */
public class CollectionCase {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("4");
        list.add("5");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("2");
        list1.add("3");
        list1.add("2");
        list1.add("4");
        list1.add("5");

        iteratorMethod(list);
        System.out.println(list);
        for (int i = 0; i < list1.size(); i++) {
            if ("2".equals(list1.get(i))) {
                list1.remove(i);
                i--;
            }
        }
        System.out.println(list1);
    }

    private static void iteratorMethod(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        // iterator 迭代器原理
        // 1、当创建完成指向某个集合或者容器的Iterator对象是，这是的指针其实指向的是第一个元素的上方，即指向一个           空
        // 2、当调用hasNext方法的时候，只是判断下一个元素的有无，并不移动指针
        // 3、当调用next方法的时候，向下移动指针，并且返回指针指向的元素，如果指针指向的内存中没有元素，会报异常。
        // 4、remove方法删除的元素是指针指向的元素。如果当前指针指向的内存中没有元素，那么会抛出异常。
        while (it.hasNext()) {
            String s = it.next();
            if ("2".equals(s)) {
                it.remove();
            }
        }
    }
}
