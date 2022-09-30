package JavaBase.day02.string;

/**
 * Java 程序中，所有的双引号字符串都是 String 这个类的对象
 * <p>
 * 字符串是常量，它们的值在创建之后不能更改
 *
 * @author qilin
 */
public class Demo1String {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());

        s1 = "def";

        /*
         * Student stu = new Student("张三", 23);
         * 可以理解为指针
         * stu = new Student("李四", 24);
         * stu.setName("王五");
         * */


        System.out.println(s1);
    }
}
