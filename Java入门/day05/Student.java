package day05;

public class Student {
    String name = "";
    int age;

    // private 修饰成员变量 保护成员不被别的类使用
    private String gender;
    private int hight;

    public void setGender(String tempGender) {
        if (tempGender != null && (tempGender.equals("female") || tempGender.equals("male"))) {
            gender = tempGender;
        } else {
            System.out.println("Gender can only be set to male or female.");
        }
    }

    // this 关键字
    // 解决局部变量隐藏成员变量问题
    // 方法被哪个对象调用，this 就代表哪个对象
    public void setHight(int hight) {
        // hight = hight
        this.hight = hight;
    }

    public int getHight() {
        return hight;
    }

    public String getGender() {
        return gender;
    }

    public void study() {
        System.out.println(name + " is studying...");
    }

    public void doHomework() {
        System.out.println(name + " doing Homework...");
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
