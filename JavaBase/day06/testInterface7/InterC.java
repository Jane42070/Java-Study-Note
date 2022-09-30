package JavaBase.day06.testInterface7;

public interface InterC extends InterA, InterB {
    @Override
    public default void method() {
        System.out.println("InterC.method() 解决代码逻辑冲突问题，重写method()方法");
    }
}
