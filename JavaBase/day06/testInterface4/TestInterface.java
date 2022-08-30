package JavaBase.day06.testInterface4;

public class TestInterface {
    public static void main(String[] args) {
        InterAImpl impl = new InterAImpl();
        // impl.show();
        InterA.show();
        InterB.show();
        // InterAImpl.show();
    }
}

class InterAImpl implements InterA {

}
