package JavaBase.day07.LambdaTest6;

/**
 * @author qilin
 */
public class Test6 {
    public static void main(String[] args) {
        useInter((x, y) -> x + y);
    }

    public static void useInter(Inter i) {
        double result = i.method(12.3, 3.14);
        System.out.println(result);
    }
}

interface Inter {
    // 用于计算 a + b 的结果并返回
    double method(double x, double y);
}