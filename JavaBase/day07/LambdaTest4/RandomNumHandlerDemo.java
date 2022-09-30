package JavaBase.day07.LambdaTest4;

import java.util.Random;

/**
 * Lambda表达式的练习3
 * 首先存在一个接口（RandomNumHandler）
 * 在该接口中存在一个抽象方法（getNumber），该方法是无参数但是有返回值
 * 在测试类中（RandomNumHandlerDemo）中存在一个方法（useRandomNumHandler）
 * 方法的参数是RandomNumHandler类型的
 * 在方法内部调用了RandomNumHandler的getNumber方法
 *
 * @author qilin
 */
public class RandomNumHandlerDemo {
    public static void main(String[] args) {
        // 使用匿名内部类
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                Random random = new Random();
                return random.nextInt(0, 50);
            }
        });

        // 使用Lambda表达式
        useRandomNumHandler(() -> {
            Random random = new Random();
            return random.nextInt(0, 100);
            // 注意：如果Lambda所操作的接口中的方法，有返回值，一定要通过return语句返回值
            // 否则会出现编译错误
        });
    }

    public static void useRandomNumHandler(RandomNumHandler handler) {
        System.out.println(handler.getNumber());
    }
}

interface RandomNumHandler {
    int getNumber();
}