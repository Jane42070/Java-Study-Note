package JavaStart.day05.Javabean;

// Javabean implementation
// 成员变量使用private修饰
// 提供每一个成员变量对应的setXxx() / getXxx()
// 提供一个无参构造方法
public class Student01 {
    private String name;
    private int age;

    // 无参构造方法
    public Student01() {
        System.out.println("无参构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
