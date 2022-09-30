package JavaBase.day06.testPolymorphic2;

/**
 * 多态的成员访问特点：
 * 成员变量：编译看左边（父类），运行看左边（父类）
 * 成员方法：编译看左边（父类），运行看右边（子类）
 *
 * @author qilin
 */
public class TestPolymorphic {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.num);
        f.method();
        // f.method1();
    }
}

class Fu {
    int num = 10;

    public void method() {
        System.out.println("Fu...");
    }
}

class Zi extends Fu {
    int num = 20;

    public void method() {
        System.out.println("Zi...");
    }

    public void method1() {
        System.out.println("11...");
    }
}