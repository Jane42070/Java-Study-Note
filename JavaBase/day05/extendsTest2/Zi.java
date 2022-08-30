package JavaBase.day05.extendsTest2;

public class Zi extends Fu {
    // 子父类中，出现了重名的成员变量
    int a = 20;

    public void method() {
        int a = 30;
        System.out.println(a);
        // 需求1：在控制台打印本类成员变量20
        System.out.println(this.a);
        // 需求2：在控制台打印父类成员变量10
        System.out.println(super.a);
    }
}
