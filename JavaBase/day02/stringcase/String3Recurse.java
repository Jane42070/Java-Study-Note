package JavaBase.day02.stringcase;

import java.util.Scanner;

/**
 * 需求：键盘录入一个字符串，使用程序遍历该字符串
 * 1. 用Scanner录入字符串
 * 2. 字符串拆分为字符数组
 * public char[] toCharArray(): 将当前字符串拆分为字符数组
 * 3. 遍历字符串
 *
 * @author qilin
 */
public class String3Recurse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串：");
        char[] chars = scanner.nextLine().toCharArray();

        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }
}
