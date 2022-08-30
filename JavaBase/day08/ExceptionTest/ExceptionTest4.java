package JavaBase.day08.ExceptionTest;

/**
 * @author qilin
 */
public class ExceptionTest4 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

        // 当代码执行到这里，就创建一个异常对象
        // 该异常创建之后，暂时没有手动处理，抛给了调用者处理
        // 下面的代码不会再执行了
        throw new RuntimeException();

        // System.out.println("5");
    }
}
