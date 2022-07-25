package JavaBase.day01.Oop.PhoneCase;

/**
 * 定义一个手机类
 * @author qilin
 * */
public class Phone {
    String brand;
    int price;

    // 打电话发短信
    public void call(String name) {
        System.out.println("Calling" + name);
    }

    public void SendMessage() {
        System.out.println("Sending Message");
    }
}
