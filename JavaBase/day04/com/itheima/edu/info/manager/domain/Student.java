package JavaBase.day04.com.itheima.edu.info.manager.domain;

/**
 * 学生信息类
 * id 学号
 * name 姓名
 * age 年龄
 * birth 生日
 *
 * @author qilin
 */
public class Student extends Person {
    public Student() {
    }

    public Student(String id, String name, int age, String birth) {
        super(id, name, age, birth);
    }
}
