package JavaBase.day08.ExceptionTest;

import java.util.Scanner;

/**
 * @author qilin
 */
public class ExceptionTest7 {
    public static void main(String[] args) {
        // 如果try中没有遇到问题，怎么执行？ 会执行try的所有代码
        // 如果try中遇到了问题，那么try下面的代码还会执行吗？ 不会
        // 如果出现的问题没有被捕获，那么程序如何运行？
        // 继续向下运行 try...catch 相当于没有写
        // 默认交给虚拟机处理
        // 同时可能出现多个异常怎么处理？ 写多个catch
        // 如果多个异常之间存在子父类关系，那么父类一定要写在下面
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的年龄：");
            String line = sc.nextLine();
            int age = Integer.parseInt(line);
            System.out.println(age);
            System.out.println(2 / 0);
        } catch (NumberFormatException e) {
            System.out.println("格式化异常出现了");
        } catch (ArithmeticException e) {
            System.out.println("数学运算异常出现了");
        } catch (RuntimeException e) {
            System.out.println("运行时异常出现了");
        } catch (Exception e) {
            System.out.println("父类异常出现了");
        }
        System.out.println("测试456");
    }
}
