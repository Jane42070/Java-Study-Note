package com.itheima.web;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author qilin
 */
public class URLDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String username = "张三";
        // 1. URL 编码
        String encode = URLEncoder.encode(username, "UTF-8");
        System.out.println(encode);

        // 2. URL 解码
        String decode = URLDecoder.decode(encode, "ISO-8859-1");
        System.out.println(decode);

        // 3. 转换为字节数据
        byte[] bytes = decode.getBytes("ISO-8859-1");
        for (byte aByte : bytes) {
            System.out.print(aByte + " ");
        }
        System.out.println();

        // 4. 将字节数组转成字符串
        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(s);
    }
}
