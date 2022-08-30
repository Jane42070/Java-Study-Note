package JavaBase.day07.ApiObject.ObjectEquals;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("张三", 23);

        // == 号比较数据类型比较的是地址值
        System.out.println(s1 == s2);
        // Object 类中的equals方法，底层也是用==号比较地址值
        System.out.println(s1.equals(s2));
    }
}
