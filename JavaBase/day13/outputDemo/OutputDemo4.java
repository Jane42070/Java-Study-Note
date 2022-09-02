package JavaBase.day13.outputDemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author qilin
 */
public class OutputDemo4 {
    public static void main(String[] args) throws IOException {
        // 第二个参数是续写开关，设置为 true 为追加写入
        FileOutputStream fos = new FileOutputStream("JavaBase/day13/outputDemo/a.txt", true);
        fos.write("\n".getBytes());
        fos.write(97);
        fos.close();
    }
}
