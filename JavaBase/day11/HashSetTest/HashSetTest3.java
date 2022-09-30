package JavaBase.day11.HashSetTest;

import java.util.HashSet;

/**
 * 要求：学生对象的成员变量值相同，我们就认为是同一对象
 *
 * @author qilin
 */
public class HashSetTest3 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("张三", 23));
        students.add(new Student("李四", 24));
        students.add(new Student("李四", 25));
        students.add(new Student("李四", 24));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
