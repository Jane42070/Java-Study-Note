package JavaBase.day08.ExceptionTest.ExceptionCase;

import java.util.Scanner;

/**
 * 案例：键盘录入数据
 * 需求：学生姓名年龄
 * 年龄18-25岁
 * 超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止。
 *
 * @author qilin
 */
public class ExceptionCase {
    public static void main(String[] args) {
        Student stu;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("请输入姓名：");
                String name = sc.nextLine();
                System.out.print("请输入年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                stu = new Student(name, age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄转换错误");
                System.out.println("请输入一个整数");
            } catch (AgeOutOfBoundsException e) {
                System.out.println("年龄超出限制");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("出现了运行时错误");
                System.out.println("请输入一个符合范围的年龄");
            }
        }

        System.out.println(stu);
    }
}
