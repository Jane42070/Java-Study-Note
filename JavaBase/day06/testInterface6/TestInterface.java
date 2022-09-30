package JavaBase.day06.testInterface6;

public class TestInterface {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.show();
    }
}

class InterImpl extends Fu implements Inter {

}
