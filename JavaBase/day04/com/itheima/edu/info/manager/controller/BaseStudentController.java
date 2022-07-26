package JavaBase.day04.com.itheima.edu.info.manager.controller;

import JavaBase.day04.com.itheima.edu.info.manager.domain.Student;
import JavaBase.day04.com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);

    // 该方法用来开启学生管理系统并展示学生管理系统菜单
    public final void start() {
        StudentLoop:
        while (true) {
            System.out.println("---------欢迎来到《学生》管理系统--------");
            System.out.println("请输入你的选择：1.添加学生 2.删除学生 3.修改学生 4.查看学生 5.退出");
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> {
                    // 添加学生
                    System.out.println("添加");
                    addStudent();
                }
                case 2 -> {
                    // 删除学生
                    System.out.println("删除");
                    deleteStudentById();
                }
                case 3 -> {
                    // 修改学生
                    System.out.println("修改");
                    UpdateStudent();
                }
                case 4 -> {
                    // 查看学生
                    // System.out.println("查看");
                    findAllStudent();
                }
                case 5 -> {
                    // 退出
                    System.out.println("感谢使用学生管理系统，再见...");
                    break StudentLoop;
                }
                default -> System.out.println("你的输入有误，请重新输入...");
            }
        }
    }

    private final void UpdateStudent() {
        String updateId = inputStudentId();

        Student newStu = inputStudentInfo(updateId);
        studentService.UpdateStudent(updateId, newStu);
    }

    private final void deleteStudentById() {
        // 1. 键盘录入要删除的学生id
        // 2. 判断id在容器中是否存在，如果不存在，则需要一直录入
        // 3. 调用 Service 中的deleteStudentById根据id删除学生
        // 4. 提示删除成功
        String id = inputStudentId();
        studentService.deleteStudentById(id);
        System.out.println("删除成功！");
    }

    private final void findAllStudent() {
        // 1. 调用业务员中的获取方法，得到学生的对象数组
        Student[] students = studentService.findAllStudent();
        // 2. 判断数组的内存地址，是否为 null
        if (students == null) {
            System.out.println("查无信息，请添加后重试");
            return;
        }
        // 3. 遍历数组，获取学生信息并打印在控制台
        System.out.println("学号\t姓名\t年龄\t生日");
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getBirth());
            }
        }
    }

    public final void addStudent() {
        // 1. 键盘接收学生信息
        // 2. 将学生信息封装为学生对象
        // 3. 将学生对象，传递给StudentService(业务员)中的addStudent方法
        // 4. 根据返回的boolean类型结果，在控制台打印成功/失败
        // 将学生对象传递给StudentService中的addStudent方法
        String id;
        while (true) {
            System.out.println("请输入学号");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("学号已被占用，请重新输入...");
            } else {
                break;
            }
        }
        Student stu = inputStudentInfo(id);
        boolean ret = studentService.addStudent(stu);
        if (ret) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    // 键盘录入学生id
    public final String inputStudentId() {
        String id;
        boolean flag;
        while (true) {
            System.out.println("请输入ID：");
            id = sc.next();
            flag = studentService.isExists(id);
            if (flag) {
                break;
            } else {
                System.out.println("ID不存在，请重新输入...");
            }
        }
        return id;
    }

    // 键盘录入并封装学生信息
    // 开闭原则：对扩展内容开放，对修改内容进行关闭
    public abstract Student inputStudentInfo(String id);
}