package JavaBase.day06.testInterface7;

public interface InterA {
    public abstract void showA();

    public default void method() {
        System.out.println("InterA.method()");
    }
}
