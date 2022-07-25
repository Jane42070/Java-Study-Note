package JavaBase.day01.Oop.PrivateDemo;

/**
 * 学生类
 *
 * @author qilin
 */

public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        if (name.length() > 0 && name.length() < 12) {
            this.name = name;
        } else {
            System.out.println("请重新输入姓名。");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("请重新输入年龄。");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void show() {
        System.out.println(this.getName() + "\n" + this.getAge());
    }
}
