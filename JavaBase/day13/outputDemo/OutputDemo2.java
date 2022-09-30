package JavaBase.day13.outputDemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author qilin
 */
public class OutputDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("JavaBase/day13/outputDemo/a.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }
}
