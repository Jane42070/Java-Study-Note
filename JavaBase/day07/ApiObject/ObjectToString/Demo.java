package JavaBase.day07.ApiObject.ObjectToString;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student("张三", 23);
        System.out.println(s);
        System.out.println(s.toString());
    }
}
