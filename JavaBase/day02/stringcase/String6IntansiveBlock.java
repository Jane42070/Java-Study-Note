package JavaBase.day02.stringcase;

import java.util.Scanner;

/**
 * 需求：键盘录入一个字符串，如果字符串包含（TMD），则使用***替换
 * String replace(CharSequence target, CharSequence replacement) {}
 *
 * @author qilin
 */
public class String6IntansiveBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String s = scanner.next();
        s = s.replace("TMD", "xxx");
        System.out.println(s);
    }
}
