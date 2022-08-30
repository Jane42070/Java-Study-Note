package JavaBase.day02.stringcase;

import java.util.Scanner;

/**
 * 需求：屏蔽手机号中间4位
 * 字符串截取：
 * String subString(int beginIndex):
 * 从传入的字符串的索引位置处向后截取
 * String subString(int beginIndex):
 * String subString(int beginIndex, int endIndex):
 *
 * @author qilin
 */
public class String5BlockPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (s.length() != 11) {
            System.out.print("请输入手机号：");
            s = scanner.next();
        }
        // 第一种方法，替换中间字符串
//        s = s.replace(s.substring(3, 7), "xxxx");
//        System.out.println(s);
        // 第二种方法
        String ss1 = s.substring(0, 3);
        String ss2 = s.substring(7);
        System.out.println(ss1 + "xxxx" + ss2);
    }
}
