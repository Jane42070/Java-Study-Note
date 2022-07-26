package JavaBase.day02.api;

import java.util.Scanner;

/**
 * Scanner 使用录入字符串
 * sc.nextLine() 结束标志：回车换行符
 * sc.next() 结束标志：空格
 *
 * @author qilin
 */
public class Demo1Scanner {
    public static void main(String[] args) {
        // 1. 创建Scanner对象
        Scanner sc = new Scanner(System.in);
/*
        System.out.print("请输入数据：");
        int i = sc.nextInt();
        sc.close();
        System.out.println("你输入的数据是：" + i);
*/
        System.out.print("请输入字符串：");
        // 用 nextLine 方法接收字符串
        String s = sc.nextLine();
        // next() 接收字符串，遇到空格就不录入数据
        String s1 = sc.next();
        System.out.println("你输入的字符串是：" + s);
    }
}
