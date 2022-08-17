package JavaBase.day05.overrideTest2;

public class Zi extends Fu{
    // @Override
    // 注解：检查当前方法是否是一个正确的重写方法
    // 静态方法不能被重写
    public static void show() {
        // super.show();
        System.out.println("Zi...");
    }

    @Override
    public void method() {
    }
}
