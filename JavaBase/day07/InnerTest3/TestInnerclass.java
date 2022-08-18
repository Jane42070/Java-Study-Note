package JavaBase.day07.InnerTest3;

public class TestInnerclass {
    /*
     * 静态成员内部类演示
     * */
    public static void main(String[] args) {
        // 外部类名.内部类名 对象名 = new 外部类名.内部类名();
        Outer.Inner oi = new Outer.Inner();
        // Outer.Inner oi = new Outer().new Inner();
        oi.show();
        Outer.Inner.method();
    }
}

class Outer {
    static class Inner {
        public void show() {
            System.out.println("Inner...show");
        }

        public static void method() {
            System.out.println("Inner...method");
        }
    }
}