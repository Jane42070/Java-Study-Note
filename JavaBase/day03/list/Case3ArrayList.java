package JavaBase.day03.list;

import JavaBase.day03.list.domain.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author qilin*/
public class Case3ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("创建学生对象...");

        for (int i = 0; i < 3; i++) {
            System.out.print("请输入姓名：");
            String name = sc.next();
            System.out.print("请输入年龄：");
            int age = sc.nextInt();

            students.add(new Student(name, age));
        }

        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}