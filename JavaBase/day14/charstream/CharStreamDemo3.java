package JavaBase.day14.charstream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author qilin
 */
public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 创建字符输出流对象
        FileWriter f = new FileWriter("JavaBase/day14/charstream/a.txt", true);
        // void write(int c); 写出一个字符
        f.write(97);
        // void write(char[] cbuf); 写出一个字符数组
        char[] cbuf = {'你', '好', '再', '见'};
        f.write(cbuf);
        // void write(char[] cbuf, int off, int len);
        f.write(cbuf, 1, 2);
        // void write(String str);
        String str = "你好再见...";
        f.write(str);
        // void write(String str, int off, int len);
        f.write(str, 4, 3);
        // 释放资源
        f.close();
    }
}
