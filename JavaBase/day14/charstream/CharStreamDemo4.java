package JavaBase.day14.charstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author qilin
 */
public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("JavaBase/day14/charstream/a.txt", true);
        f.write("Hello World");
        // f.flush();
        f.write("\nHello World");
        f.close();
    }
}
