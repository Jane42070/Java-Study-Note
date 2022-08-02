package JavaBase.day03.arraylist;

import JavaBase.day03.arraylist.domain.Student;

public class TestObjectArray {
    public static void main(String[] args) {
        // 初始化长度为3的数组，类型为Student类型
        Student[] arr = new Student[3];

        // 根据需求创建学生对象
        Student stu1 = new Student("张三", 21);
        Student stu2 = new Student("李四", 24);
        Student stu3 = new Student("王五", 25);

        // 将学生对象存入数组
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        for (Student student : arr) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}
