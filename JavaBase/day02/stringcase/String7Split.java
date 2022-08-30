package JavaBase.day02.stringcase;

import java.util.Scanner;

/**
 * 需求：字符串形式录入学生信息，例如："张三,23"，从该字符串中切割出有效数据
 * 封装为学生对象
 *
 * @author qilin
 */
public class String7Split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生信息：");
        String info = scanner.next();
        String7Student stu = new String7Student(info);
    }
}
