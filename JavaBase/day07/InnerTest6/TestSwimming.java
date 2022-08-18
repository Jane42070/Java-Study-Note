package JavaBase.day07.InnerTest6;

public class TestSwimming {
    public static void main(String[] args) {
        // 需求，goSwimming 方法
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("I'm swimming...");
            }
        });
    }

    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}
