package day05.Javabean;
/**
 * Javabean 测试类
 * @author qilin
 */
public class StudentDemo01 {
    public static void main(String[] args) {
        Student01 stu = new Student01();
        stu.setName("福瑞婷");
        stu.setAge(26);
        System.out.println(stu.getName() + "," + stu.getAge());
    }
}
