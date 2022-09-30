package JavaBase.day09.CollectionTest;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionCase2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 24));
        list.add(new Student("王五", 25));

        iterator(list);
        enhancedFor(list);
        commonFor(list);
    }

    private static void commonFor(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void iterator(ArrayList<Student> list) {
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    private static void enhancedFor(ArrayList<Student> list) {
        for (Student stu : list) {
            System.out.println(stu.toString());
        }
    }
}
