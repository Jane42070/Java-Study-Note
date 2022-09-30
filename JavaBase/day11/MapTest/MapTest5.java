package JavaBase.day11.MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author qilin
 */
public class MapTest5 {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();

        map.put(new Student("张三", 23), "四川");
        map.put(new Student("李四", 24), "重庆");
        map.put(new Student("王武", 25), "云南");

        // 1. 获取所有的键
        Set<Student> set = map.keySet();
        for (Student student : set) {
            System.out.println(student + " " + map.get(student));
        }

        System.out.println("----------------");

        // 2. 获取所有键值对
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("----------------");

        // 3. Lambda 表达式
        map.forEach((Student student, String province) -> {
            System.out.println(student + " " + province);
        });
    }
}
