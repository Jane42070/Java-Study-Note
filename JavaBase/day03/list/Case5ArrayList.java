package JavaBase.day03.list;

import JavaBase.day03.list.domain.Student;
import java.util.ArrayList;

/**
 * 需求：创建学生集合，筛选出18岁的，存放到新集合中
 *
 * @author qilin
 */
public class Case5ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("张三", 18));
        students.add(new Student("福瑞婷", 18));
        students.add(new Student("蹇棋林", 80));
        students.add(new Student("李四", 222));
        students.add(new Student("王五", 23));

        ArrayList<Student> teenagers = getTeenagersList(students);

        // System.out.println(students);

        for (Student student : teenagers) {
            System.out.println(student.getName() + " " + student.getAge());
        }

        // System.out.println(teenagers);
    }

    public static ArrayList<Student> getTeenagersList(ArrayList<Student> students) {

        ArrayList<Student> teenagers = new ArrayList<>();

        for (Student student : students) {
            if (student.getAge() <= 18) {
                teenagers.add(student);
            }
        }
        return teenagers;
    }
}
