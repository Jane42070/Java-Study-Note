package JavaBase.day07.LambdaTest7;

public class Test {
    public static void main(String[] args) {
        // Lambda 调用
        useInter(() ->
                System.out.println("Lambda执行了")
        );

        // 匿名内部类
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类执行了");
            }
        });
    }

    public static void useInter(Inter i) {
        i.show();
    }
}

interface Inter {
    void show();
}