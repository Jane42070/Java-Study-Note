package JavaBase.day07.LambdaTest5;

/**
 * Lambda表达式的练习4
 * 首先存在一个接口（Calculator）
 * 在该接口中存在一个抽象方法（calc），该方法是有参数也有返回值
 * 在测试类（CalculatorDemo）中存在一个方法（useCalculator），方法的参数是Calculator类型的，在方法内部调用了Calculator的calc方法
 *
 * @author qilin
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        // 匿名内部类实现
        useCalculator(new Calculator() {
            @Override
            public int calc(int x, int y) {
                return x + y;
            }
        });

        // Lambda 实现
        useCalculator((x, y) -> x + y);

    }

    public static void useCalculator(Calculator calculator) {
        System.out.println(calculator.calc(40, 50));
    }
}

interface Calculator {
    int calc(int x, int y);
}
