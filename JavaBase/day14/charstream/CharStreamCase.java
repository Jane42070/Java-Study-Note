package JavaBase.day14.charstream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author qilin
 */
public class CharStreamCase {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String user = sc.nextLine();
        System.out.print("请输入密码：");
        String password = sc.nextLine();

        FileWriter fw = new FileWriter("JavaBase/day14/charstream/users.txt", true);
        fw.write(user + "\n");
        fw.write(password + "\n");
        fw.close();
    }
}
