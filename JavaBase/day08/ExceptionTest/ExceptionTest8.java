package JavaBase.day08.ExceptionTest;

/**
 * @author qilin
 */
public class ExceptionTest8 {
    // public String getMessage() 返回 throwable 的详细信息字符串
    // public String toString() 返回此可抛出的简短描述
    // public void printStackTrace() 把异常的错误信息输出在控制台（字体是红色字体）
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
            System.out.println(arr[10]);
            // 虚拟机帮我们创建了一个异常对象
            // new ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();
            message = e.toString();
            System.out.println(message);
            e.printStackTrace();
        }

        System.out.println("嘿嘿嘿");
    }
}
