package JavaBase.day03.list.StudentManageSystem;

import JavaBase.day03.list.StudentManageSystem.domain.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生成绩管理系统
 * 1. 创建学生信息
 * 2. 修改学生信息
 * 3. 查看学生信息
 * 4. 所有学生信息
 * 5. 退出
 *
 * @author qilin
 */
public class ManageArrayList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        lo:
        while (true) {
            System.out.println("----------------");
            System.out.println("学生成绩管理系统");
            System.out.println("1. 创建学生信息");
            System.out.println("2. 修改学生信息");
            System.out.println("3. 查看学生信息");
            System.out.println("4. 所有学生信息");
            System.out.println("5. 删除学生信息");
            System.out.println("6. 退出");
            System.out.println("----------------");
            System.out.print("请输入选项：");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    createStuInfos(students);
                    break;
                case 2:
                    System.out.println("请输入学号：");
                    String number = sc.next();
                    modifyStuInfos(students, number);
                    break;
                case 3:
                    System.out.println("请输入学号：");
                    number = sc.next();
                    searchStuInfos(students, number);
                    break;
                case 4:
                    allStuInfos(students);
                    break;
                case 5:
                    System.out.println("请输入学号：");
                    number = sc.next();
                    deleteStuInfos(students, number);
                    break;
                case 6:
                    System.out.println("再见...");
                    break lo;
                default:
                    System.out.println("你的输入有误，请重新输入...");
            }
        }
    }

    private static void deleteStuInfos(ArrayList<Student> students, String number) {
        int index = getIndex(students, number);
        if (index == -1) {
            System.out.println("查无此人...");
            return;
        }
        students.remove(index);
        System.out.println("删除学生信息成功");
    }

    private static void allStuInfos(ArrayList<Student> students) {
        System.out.println("---所有学生信息---");
        int index = 0;
        for (Student student : students) {
            index++;
            System.out.println(index + ". 学号：" + student.getNumber() + " 姓名：" + student.getName() + " 年龄：" + student.getAge() + " 生日：" + student.getBrith());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("回车退出...");
        sc.nextLine();
    }

    private static void searchStuInfos(ArrayList<Student> students, String number) {
        System.out.println("---查找学生信息---");
        int index = getIndex(students, number);
        if (students.size() == 0 || index == -1) {
            System.out.println("无信息，请添加后重新查询");
            return;
        }
        Student student = students.get(index);
        System.out.println("学号：" + student.getNumber() + " 姓名：" + student.getName() + " 年龄：" + student.getAge() + " 生日：" + student.getBrith());
        Scanner sc = new Scanner(System.in);
        System.out.println("回车退出...");
        sc.nextLine();
    }

    private static void modifyStuInfos(ArrayList<Student> students, String number) {
        System.out.println("---修改学生信息---");
        Scanner sc = new Scanner(System.in);
        int index = getIndex(students, number);
        if (index == -1) {
            System.out.println("查无此人");
            return;
        }
        Student stu = students.get(index);
        lo:
        while (true) {
            System.out.println("1.修改学号");
            System.out.println("2.修改姓名");
            System.out.println("3.修改年龄");
            System.out.println("4.修改生日");
            System.out.println("5.退出");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("输入学号：");
                    number = sc.next();
                    if (getIndex(students, number) != -1) {
                        System.out.println("学号已存在...");
                        break;
                    }
                    stu.setNumber(number);
                    break;
                case 2:
                    System.out.println("输入姓名：");
                    String name = sc.next();
                    stu.setName(name);
                    break;
                case 3:
                    System.out.println("输入年龄：");
                    int age = sc.nextInt();
                    stu.setAge(age);
                    break;
                case 4:
                    System.out.println("输入生日：");
                    String brith = sc.next();
                    stu.setBrith(brith);
                    break;
                case 5:
                    break lo;
                default:
                    System.out.println("输入有误，请重新输入...");
            }
        }
    }

    private static void createStuInfos(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("创建学生信息：");
        String number;
        do {
            while (true) {
                System.out.println("输入学号：");
                number = sc.next();
                if (getIndex(students, number) == -1) {
                    break;
                } else {
                    System.out.println("学号存在！请重新输入...");
                }
            }
            System.out.println("输入姓名：");
            String name = sc.next();
            System.out.println("输入年龄");
            int age = sc.nextInt();
            System.out.println("输入生日");
            String birth = sc.next();

            students.add(new Student(number, name, age, birth));
            System.out.println("继续创建？（1/0）");
        } while (sc.nextInt() != 0);
    }

    public static int getIndex(ArrayList<Student> students, String number) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getNumber().equals(number)) {
                index = i;
            }
        }
        return index;
    }
}
