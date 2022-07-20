package day06.scanner03;

import java.util.Scanner;

/**
 * Scanner 数据求和
 * 需求：键盘录入两个整数，求两个数据和，并在控制台输出求和结果
 *
 * @author qilin
 */
public class ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();

        System.out.println("他们的和是：" + (a + b));
    }
}
