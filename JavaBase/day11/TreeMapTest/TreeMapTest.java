package JavaBase.day11.TreeMapTest;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author qilin
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Map<Student, String> map = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        map.put(new Student("李四", 24), "云南");
        map.put(new Student("阿四", 24), "新疆");
        map.put(new Student("张三", 23), "重庆");
        map.put(new Student("张三", 21), "东北");
        map.put(new Student("王武", 24), "四川");
        map.put(new Student("老六", 17), "大连");

        System.out.println(map);
        // 1. 获取键值对
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("----------------");
        // 2. 获取键集合
        Set<Student> students = map.keySet();
        for (Student student : students) {
            System.out.println(student + " " + map.get(student));
        }
        System.out.println("----------------");
        // 3. Lambda
        map.forEach((Student student, String province) -> {
            System.out.println(student + " " + province);
        });
    }
}
