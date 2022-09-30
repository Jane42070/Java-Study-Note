package JavaBase.day13.outputDemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author qilin
 */
public class OutputDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("JavaBase/day13/outputDemo/a.txt");
/*
        byte[] bytes = {97, 98, 99};
        fos.write(bytes);
*/
        byte[] bytes = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107};
        fos.write(bytes, 1, 2);
        fos.close();
    }
}
