package JavaBase.day14.charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author qilin
 */
public class CharStreamDemo7 {
    public static void main(String[] args) throws IOException {
        BufferedWriter buff = new BufferedWriter(new FileWriter("JavaBase/day14/charstream/a.txt", true));
        buff.write("Hello World");
        buff.newLine();
        buff.write("Hello World");
        buff.newLine();
        buff.flush();
        buff.close();
    }
}
