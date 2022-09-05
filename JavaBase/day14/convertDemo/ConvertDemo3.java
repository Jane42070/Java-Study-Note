package JavaBase.day14.convertDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author qilin
 */
public class ConvertDemo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("JavaBase/day14/convertDemo/users.txt"));
        User user = (User) ois.readObject();
        System.out.println(user);
        ois.close();
    }
}
