package JavaBase.day06.testInterface5;

public class TestInterface {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.start();
        ii.end();

        Inter.open();
        Inter.close();
    }
}

class InterImpl implements Inter {

}
