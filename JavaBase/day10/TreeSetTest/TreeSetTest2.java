package JavaBase.day10.TreeSetTest;

import java.util.TreeSet;

/**
 * TreeSet 集合存储Student类型
 *
 * @author qilin
 */
public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Student s1 = new Student("zhangsan", 27);
        Student s2 = new Student("lisi", 28);
        Student s3 = new Student("wangwu", 26);
        Student s4 = new Student("zhaoliu", 27);

        students.add(s1);
        students.add(s3);
        students.add(s4);
        students.add(s2);
        System.out.println(students);
    }
}
