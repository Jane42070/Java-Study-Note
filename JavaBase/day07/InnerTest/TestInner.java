package JavaBase.day07.InnerTest;

public class TestInner {
    public static void main(String[] args) {
        /*
         * 创建内部类对象的格式：
         * 外部类名.内部类名 = new 外部类对象().new 内部类对象();
         * */
        Outer.Inner i = new Outer().new Inner();
        System.out.println(i.num);
        i.show();
    }
}

class Outer {
    int a = 10;
    class Inner {
        int num = 10;

        public void show() {
            System.out.println("Inner");
            // 内部类，访问外部类成员，可以直接访问，包括私有
            System.out.println(a);
        }
    }
}