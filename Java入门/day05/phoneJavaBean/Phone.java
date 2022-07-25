package day05.phoneJavaBean;

// 手机 Javabean
public class Phone {
    private String brand;
    private int price;

    public Phone() {
        System.out.println("无参构造方法");
    }

    public Phone(String brand, int price) {
        System.out.println("带参构造方法");
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
