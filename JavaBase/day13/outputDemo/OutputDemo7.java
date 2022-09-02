package JavaBase.day13.outputDemo;

import java.io.*;

/**
 * @author qilin
 */
public class OutputDemo7 {
    public static void main(String[] args) throws IOException {
        // 缓冲流结合数组，进行拷贝
        // 创建一个字节缓冲输入流
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("JavaBase/day13/outputDemo/a.txt"));
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("JavaBase/day13/outputDemo/a.txt.dup"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes))!= -1) {
            bos.write(bytes, 0, len);
        }
        bis.close();
        bos.close();
    }
}
