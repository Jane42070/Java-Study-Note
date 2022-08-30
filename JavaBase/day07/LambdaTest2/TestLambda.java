package JavaBase.day07.LambdaTest2;

/**
 * Lambda 表达式的使用前提
 * 1. 一个接口
 * 2. 接口中有且仅有一个抽象方法
 * 练习1：
 * 1. 编写一个接口（ShowHandler）
 * 2. 在该接口中存在一个抽象方法（show），该方法是无参数返回值
 * 3. 在测试类中（ShowHandlerDemo）中存在一个（useShowHandler）
 * 方法的参数是ShowHandler类型的
 * 在方法内部调用了ShowHandler的show方法
 *
 * @author qilin
 */
public class TestLambda {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类中的show方法");
            }
        });
        useShowHandler(() ->
                System.out.println("我是Lambda实现的show方法")
        );
    }

    public static void useShowHandler(ShowHandler handler) {
        handler.show();
    }
}

interface ShowHandler {
    void show();
}