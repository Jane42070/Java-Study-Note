package JavaBase.day13.outputDemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author qilin
 */
public class OutputDemo {
    public static void main(String[] args) throws IOException {
        // 创建字节流输出对象
        // 如果文件不存在，会自动创建
        // 如果文件存在，清空重新写
        FileOutputStream fos = new FileOutputStream("JavaBase/day13/outputDemo/a.txt");
        // 写入数据
        fos.write(97);
        fos.write("\nHello World".getBytes());
        // 释放资源
        // 告诉操作系统，我现在已经不用这个文件了
        fos.close();
    }
}