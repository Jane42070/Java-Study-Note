package JavaBase.day03.list;

import JavaBase.day03.list.domain.Student;

import java.util.ArrayList;

/**
 * 需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 *
 * @author qilin
 */
public class Case2ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三", 21));
        students.add(new Student("李四", 22));
        students.add(new Student("王五", 23));

        System.out.println(students);
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}