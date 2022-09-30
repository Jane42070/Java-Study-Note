package JavaBase.day06.testInterface7;

public interface InterB {
    public abstract void showB();

    public default void method() {
        System.out.println("InterB.method()");
    }
}
