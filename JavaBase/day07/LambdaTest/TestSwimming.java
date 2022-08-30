package JavaBase.day07.LambdaTest;

public class TestSwimming {
    public static void main(String[] args) {
        // 需求，goSwimming 方法
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("I'm swimming...");
            }
        });

        /*
         * 理解：对于Lambda表达式，对匿名内部类进行了优化
         * 代码更少，关注点更加明确
         * */
        goSwimming(() ->
                System.out.println("铁汁，我们去游泳吧！")
        );
    }

    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}
