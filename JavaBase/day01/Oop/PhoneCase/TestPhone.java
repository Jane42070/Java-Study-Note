package JavaBase.day01.Oop.PhoneCase;

/**
 * 手机测试类
 * @author qilin
 * */
public class TestPhone {
    public static void main(String[] args) {
        // 1. 创建对象
        Phone Xiaomi = new Phone();
        // 2. 给成员变量赋值
        Xiaomi.brand = "Redmi K40";
        Xiaomi.price = 1999;

        // 3. 打印成员变量的值
        System.out.println(Xiaomi.brand + " " + Xiaomi.price);

        // 4. 调用成员方法
        Xiaomi.call("Jane");
    }
}
