package JavaBase.day02.api;

import java.util.Scanner;

/**
 * nextInt() 和 nextLine() 方法配合使用的时候，nextLine() 方法就没有键盘录入的机会了
 * 建议：今后键盘录入数据的时候，如果是字符串和整数一起接收，建议使用next()方法接收字符串
 *
 * @author qilin
 */
public class Demo2Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int num = sc.nextInt(); // 10 + 回车换行
        System.out.println("请输入字符串：");
//        String s = sc.nextLine();
        String s = sc.next();

        System.out.println(num);
        System.out.println(s);
    }
}