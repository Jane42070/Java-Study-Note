package day06.importpack02;

import day06.importpack01.Student01;
// Alt + Enter 快捷键导包

/**
 * @author qilin
 */
public class StudentTest01 {
    public static void main(String[] args) {
/*
        Student01 stu = new Student01();
        day06.importpack01.Student01 stu = new day06.importpack01.Student01();
        stu.Study();

        day06.importpack01.Student01 stu2 = new day06.importpack01.Student01();
        stu2.Study();
*/
        // 优化代码
        Student01 stu1 = new Student01();
        stu1.Study();
    }
}
