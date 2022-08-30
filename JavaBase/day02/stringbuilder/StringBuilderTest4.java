package JavaBase.day02.stringbuilder;

import java.util.Scanner;

/**
 * 需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或者不是
 * 思路：
 * 1. 键盘录入字符串
 * 2. 将键盘录入的字符串反转
 * 3. 反转后字符串与其比对，如果一样则相同
 *
 * @author qilin
 */
public class StringBuilderTest4 {
    public static void main(String[] args) {
        System.out.print("请输入字符串：");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        StringBuilder sb = new StringBuilder(s);

        // 两个对象不同，必须转换后比较
        if (s.equals(sb.reverse().toString())) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }

    }
}
