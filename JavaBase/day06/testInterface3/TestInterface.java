package JavaBase.day06.testInterface3;

public class TestInterface {
    public static void main(String[] args) {
        InterAImpl ia = new InterAImpl();
        ia.show();
    }
}

class InterAImpl implements InterA, InterB {
    @Override
    public void show() {
        System.out.println("我是重写后的show方法");
    }
}