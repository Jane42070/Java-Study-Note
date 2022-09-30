package JavaBase.day13.outputDemo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author qilin
 */
public class InputDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 如果文件存在，不会报错
            // 如果文件不存在，那么就直接报错
            fis = new FileInputStream("JavaBase/day13/outputDemo/a.txt");
            // 一次读一个数据
            // 默认 int 类型，如果想看到字符，需要强转成 char 类型
            int read = fis.read();
            // 多个字节，用 while 循环
            while (read != -1) {
                System.out.println(read);
                read = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
