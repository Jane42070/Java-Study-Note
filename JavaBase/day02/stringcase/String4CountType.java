package JavaBase.day02.stringcase;

import java.util.Scanner;

/**
 * 需求：键盘录入一个字符串，统计该字符串中大写，小写，数字字符出现的次数
 * 1. Scanner 录入字符串
 * 2. 要统计三种类型的字符个数，定义三个变量
 * @author qilin */
public class String4CountType {
    public static void main(String[] args) {
        int upper = 0;
        int lower = 0;
        int number = 0;

        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();
        for (char c : chars) {
            if (c > 'A' && c <= 'Z') {
                upper++;
            } else if (c >= '0' && c <= '9') {
                number++;
            } else if (c >= 'a' && c <= 'z') {
                lower++;
            }
        }

        System.out.println("number: " + number + " upper: " + upper + " lower: " + lower);
    }
}
