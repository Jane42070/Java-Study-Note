package JavaBase.day14.convertDemo;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author qilin
 */
public class ConvertDemo {
    public static void main(String[] args) throws IOException {
        // 文件直接读取可能会导致乱码
        // 因为 idea 默认 UTF-8
        // window 是 GBK
        InputStreamReader isr = new InputStreamReader(new FileInputStream("JavaBase/day14/convertDemo/a.txt"));
        int read;
        while ((read = isr.read()) != -1) {
            System.out.println((char) read);
        }
        isr.close();

        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("JavaBase/day14/convertDemo/a.txt", true), StandardCharsets.UTF_8);
        out.write("我爱学习，谁也别打扰我");
        out.flush();
        out.close();
    }
}
