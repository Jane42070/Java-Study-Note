package JavaBase.day04.com.itheima.edu.info.manager.controller;

import JavaBase.day04.com.itheima.edu.info.manager.domain.Student;
import JavaBase.day04.com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController{
    private Scanner sc = new Scanner(System.in);
    @Override
    // 键盘录入并封装学生信息
    // 开闭原则：对扩展内容开放，对修改内容进行关闭
    public Student inputStudentInfo(String id) {
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入生日");
        String birth = sc.next();
        Student stu = new Student(id, name, age, birth);
        return stu;
    }
}