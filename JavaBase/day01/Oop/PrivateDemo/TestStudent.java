package JavaBase.day01.Oop.PrivateDemo;

public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(26);

        System.out.println("姓名：" + stu1.getName() + " 年龄：" + stu1.getAge());
        stu1.show();
    }
}
