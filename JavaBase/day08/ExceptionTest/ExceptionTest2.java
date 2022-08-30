package JavaBase.day08.ExceptionTest;

/**
 * @author qilin
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        // 思考：控制台为什么会有这样红色字体呢？是谁打印的？
        int[] arr = {1, 2, 3, 4, 5, 6};
        // 当代码出现了异常，那么就在这里创建了一个异常对象
        // new ArrayIndexOutOfBoundsException();
        // 首先就看，程序中有没有自己处理异常的代码
        // 如果没有，交给本方法调用者处理。
        // 最终这个异常会交给虚拟机默认处理
        // 1. 将异常信息以红色字体展示在控制台上
        // 2. 停止程序运行
        System.out.println(arr[10]);
        System.out.println("嘿嘿嘿，我最帅");
    }
}
