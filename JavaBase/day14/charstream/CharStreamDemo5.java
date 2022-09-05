package JavaBase.day14.charstream;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author qilin
 */
public class CharStreamDemo5 {
    public static void main(String[] args) throws IOException {
        // FileReader fr = new FileReader(new File("JavaBase/day14/charstream/a.txt"));
        FileReader fr = new FileReader("JavaBase/day14/charstream/a.txt");
        // 一次读取多个字符
        // method1(fr);
        // 一次一个字符
        method2(fr);
    }

    private static void method2(FileReader fr) throws IOException {
        int read;
        while ((read = fr.read()) != -1) {
            System.out.println((char) read);
        }
        fr.close();
    }

    private static void method1(FileReader fr) throws IOException {
        char[] buf = new char[10];
        int read = fr.read(buf);
        System.out.println(buf);
        fr.close();
    }
}
