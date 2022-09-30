package JavaBase.day08.ExceptionTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author qilin
 */
public class ExceptionTest3 {
    public static void main(String[] args) throws NullPointerException, ParseException {
        // 即使调用者没有做处理，虚拟机也会自动处理
        method1();
        // 还是继续交给调用者处理
        method2();
    }

    // 告诉调用者，你调用我，有可能会出现这样的异常哦
    // 如果方法中没有出现异常，那么正常执行
    // 如果方法中国呢真的出现了异常，其实也是将这个异常交给了调用者处理
    // 如果声明的异常是一个编译时异常，必须要手动写出
    private static void method2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.parse("2048年10月10日");
    }

    // 告诉调用者，你调用我，有可能会出现这样的异常哦
    // 如果方法中没有出现异常，那么正常执行
    // 如果方法中国呢真的出现了异常，其实也是将这个异常交给了调用者处理
    // 如果声明的异常是一个运行时异常，那么声明的代码可以省略
    private static void method1() /*throws NullPointerException*/ {
        int[] arr = null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
