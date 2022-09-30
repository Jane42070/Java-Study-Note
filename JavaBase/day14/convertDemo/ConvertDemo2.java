package JavaBase.day14.convertDemo;

import java.io.*;

/**
 * @author qilin
 */
public class ConvertDemo2 {
    public static void main(String[] args) throws IOException {
        User user = new User("zhangsan", "123456");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaBase/day14/convertDemo/users.txt"));
        oos.writeObject(user);
        oos.close();
    }
}
