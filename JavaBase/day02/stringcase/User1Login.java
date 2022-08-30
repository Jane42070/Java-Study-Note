package JavaBase.day02.stringcase;

import java.util.Scanner;

/**
 * 需求：已知用户名和密码，用程序模拟用户登录
 * 总共三次机会，登陆之后，给出相应提示
 * 键盘录入用户名和密码，用Scanner实现
 * 用equals比较
 * 用循环实现多次机会
 *
 * @author qilin
 */
public class User1Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "Jane42070";
        String password = "123456";
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String userPassword = sc.next();
            if (userName.equals(username) && userPassword.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("用户名或密码错误，你还剩" + (2 - i) + "次机会");
            }
        }
    }
}
