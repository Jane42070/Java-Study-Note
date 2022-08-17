package JavaBase.day05.extendsConstructor;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student("张三", 23, 100);
        System.out.println(stu.getName() + " " + stu.getAge() + " " + stu.getScore());

        Student student = new Student();
    }
}
