package JavaBase.day13.outputDemo;

import java.io.*;

/**
 * @author qilin
 */
public class OutputDemo6 {
    public static void main(String[] args) {
        // 利用缓冲流拷贝文件
        try {
            // 创建一个字节缓冲输入流对象
            BufferedInputStream bis = new BufferedInputStream(
                    new FileInputStream("JavaBase/day13/outputDemo/a.txt"));
            // 创建一个字节缓冲输出流对象
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream("JavaBase/day13/outputDemo/a.txt.dup"));
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
