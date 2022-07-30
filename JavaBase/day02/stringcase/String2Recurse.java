package JavaBase.day02.stringcase;

import java.util.Scanner;

/**
 * 需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串
 * <p>
 * 思路：
 * 1. Scanner 获取字符串
 * 2. public char charAt(int index): 返回指定索引处的char值，字符串的索引也是从0开始的
 * 3. 遍历字符串，需要获取到字符串的长度 public int length(): 返回字符串长度
 * 4. 遍历打印
 *
 * @author qilin
 */
public class String2Recurse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
