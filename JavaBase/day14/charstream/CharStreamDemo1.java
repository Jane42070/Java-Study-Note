package JavaBase.day14.charstream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author qilin
 */
public class CharStreamDemo1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("JavaBase/day14/charstream/a.txt");
            int b;
            while ((b = fis.read())!= -1) {
                System.out.println((char)b);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
