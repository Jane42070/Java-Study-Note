package JavaStart.day05.phoneJavaBean;

public class PhoneDemo01 {
    public static void main(String[] args) {
        // 无参构造方法+set方法
        Phone p1 = new Phone();
        p1.setBrand("华为");
        p1.setPrice(9999);
        System.out.println(p1.getBrand() + " " + p1.getPrice());

        // 带参构造方法
        Phone p2 = new Phone("华为", 9999);
        System.out.println(p2.getBrand() + " " + p2.getPrice());
    }
}
