package JavaBase.day04.com.itheima.edu.info.manager.controller;

import JavaBase.day04.com.itheima.edu.info.manager.domain.Teacher;
import JavaBase.day04.com.itheima.edu.info.manager.service.TeacherService;

import java.util.Scanner;

/**
 * @author qilin
 */
public class TeacherController {
    private Scanner sc = new Scanner(System.in);
    private TeacherService teacherService = new TeacherService();

    public void start() {
        loop:
        while (true) {
            System.out.println("---------欢迎来到《老师》管理系统--------");
            System.out.println("请输入你的选择：1.添加老师 2.删除老师 3.修改老师 4.查看老师 5.退出");
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> {
                    // 添加老师
                    addTeacher();
                }
                case 2 -> {
                    // 删除老师
                    deleteTeacherById();
                }
                case 3 -> {
                    // 修改老师
                    UpdateTeacher();
                }
                case 4 -> {
                    // 查看老师
                    findAllTeachers();
                }
                case 5 -> {
                    break loop;
                }

                default -> System.out.println("输入有误，请重新输入...");
            }
        }
    }

    private void UpdateTeacher() {
        String id = inputTeacherId();
        Teacher teacher = inputTeacherInfo(id);
        TeacherService.updateTeacher(teacher);
        System.out.println("更新成功");
    }

    private void findAllTeachers() {
        Teacher[] teachers = teacherService.findAllTeacher();
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher.getId() + " " + teacher.getName() + " " + teacher.getAge() + " " + teacher.getBirth());
            }
        }
    }

    private void deleteTeacherById() {
        String id = inputTeacherId();
        teacherService.deleteTeacherById(id);
        System.out.println("删除成功！");
    }

    private void addTeacher() {
        while (true) {
            System.out.println("请输入老师ID：");
            String id = sc.next();
            if (teacherService.isExists(id)) {
                System.out.println("ID存在，请重新输入...");
                System.out.println("或者按0退出...");
                if (sc.next().equals("0")) {
                    break;
                }
            } else {
                Teacher teacher = inputTeacherInfo(id);
                teacherService.addTeacher(teacher);
                break;
            }
        }
    }

    public String inputTeacherId() {
        String id;
        boolean flag;
        while (true) {
            System.out.println("请输入老师ID：");
            id = sc.next();
            flag = teacherService.isExists(id);
            if (flag) {
                break;
            } else {
                System.out.println("ID不存在，请重新输入...");
                System.out.println("或者按0退出...");
                if (sc.next().equals("0")) {
                    break;
                }
            }
        }
        return id;
    }

    public Teacher inputTeacherInfo(String id){
        String name;
        int age;
        String birth;
        System.out.println("请输入姓名：");
        name = sc.next();
        System.out.println("请输入年龄：");
        age = sc.nextInt();
        System.out.println("请输入生日：");
        birth = sc.next();
        Teacher teacher = new Teacher(id, name, age, birth);
        return teacher;
    }
}
