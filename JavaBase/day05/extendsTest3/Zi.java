package JavaBase.day05.extendsTest3;

public class Zi extends Fu{
    public void show() {
        System.out.println("子类show方法");
    }
    public void method() {
        show();
        super.show();
    }
}
