package JavaBase.day07.LambdaTest3;

/**
 * 首先存在一个接口（StringHandler）
 * 在该接口中中存在一个抽象方法（printMessage），该方法是有参数无返回值
 * 在测试类（StringHandlerDemo）中存在一个方法（useStringHandler）
 * 方法的参数是String类型的，在方法内部调用了StringHandler的printMessage方法
 *
 * @author qilin
 */
public class StringHandlerDemo {
    public static void main(String[] args) {
        // 匿名内部类实现
        useStringHandler(new StringHandler() {
            @Override
            public void printMessage(String message) {
                System.out.println("我是匿名内部类" + message);
            }
        });

        // Lambda 实现
        useStringHandler(message ->
                System.out.println("我是Lambda表达式" + message)
        );
    }

    // 传递一个接口的实现类
    // 然后在printMessage参数中赋值
    // Lambda 或者 匿名内部类实现 printMessage 方法
    public static void useStringHandler(StringHandler handler) {
        handler.printMessage("打印信息");
    }
}

interface StringHandler {
    void printMessage(String message);
}