package JavaBase.day14.charstream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 编码：
 * byte[] getBytes()：使用平台默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中
 * byte[] getBytes(String charsetName)：使用指定的字符集将该String编码为一系列字节，将结果存储到新的字节数组中
 * 解码：
 * String(byte[] bytes)：通过平台默认字符集解码指定的字节数组来构造新的String
 * String(byte[] bytes, String charsetName)：通过指定的字符集解码指定的字节数组来构造新的String
 *
 * @author qilin
 */
public class CharStreamDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        method1();
        // String (byte[] bytes)
        // String (byte[] bytes, String charsetName)
        byte[] bytes = {-28, -67, -96, -27, -91, -67};
        byte[] bytes1 = {-60, -29, -70, -61};
        // 利用 UTF-8 解码
        String s1 = new String(bytes);
        // 利用指定 GBK 进行解码
        String s2 = new String(bytes1, "GBK");
        System.out.println(s1);
        System.out.println(s2);
    }

    private static void method1() throws UnsupportedEncodingException {
        // byte[] getBytes()
        String s = "你好";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

        // byte[] getBytes(String charsetName)
        s = "你好";
        bytes = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
    }
}
