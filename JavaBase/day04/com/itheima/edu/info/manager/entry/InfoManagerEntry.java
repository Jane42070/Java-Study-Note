package JavaBase.day04.com.itheima.edu.info.manager.entry;

import JavaBase.day04.com.itheima.edu.info.manager.controller.StudentController;
import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // 主菜单搭建
            System.out.println("---------欢迎来到黑马信息管理系统--------");
            System.out.println("请输入你的选择：1.学生管理 2.老师管理 3.退出");
            int choose = sc.nextInt();
            // 进阶 switch
            switch (choose) {
                case 1 -> {
                    // System.out.println("学生管理");
                    // 开启学生管理系统
                    StudentController studentController = new StudentController();
                    studentController.start();
                }
                case 2 -> System.out.println("老师管理");
                case 3 -> {
                    System.out.println("感谢您的使用");
                    // 退出当前正在运行的JVM虚拟机
                    System.exit(0);
                }
                // break lo;
                default -> System.out.println("您的输入有误，请重新输入...");
            }
        }
        // System.out.println("---------欢迎来到《老师》管理系统--------");
        // System.out.println("请输入你的选择：1.添加老师 2.删除老师 3.修改老师 4.查看老师 5.退出");
    }
}
