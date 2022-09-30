package JavaBase.day06.testInterface2;

public class TestInterface {
    /*
     * 成员变量：只能是常量 系统会默认加入三个关键字
     * public static final
     * 构造方法：没有
     * 成员方法：只能是抽象方法，系统会默认加入两个关键字
     * public abstract
     * */
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        // 常量可以通过类名点调用
        System.out.println(Inter.num);
    }
}

class InterImpl implements Inter {
    // 接口实现类中的构造方法，super访问的是所有类继承的父类 Object
    public InterImpl() {
        super();
    }

    public void method() {
        // num = 20;
        System.out.println(num);
    }

    @Override
    public void show() {

    }
}