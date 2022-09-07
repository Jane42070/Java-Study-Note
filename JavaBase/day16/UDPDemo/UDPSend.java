package JavaBase.day16.UDPDemo;

import java.io.IOException;
import java.net.*;

/**
 * @author qilin
 */
public class UDPSend {
    public static void main(String[] args) throws IOException {
        // 创建发送端 DatagramSocket 对象（DatagramSocket）
        DatagramSocket ds = new DatagramSocket();
        // 录入数据
        byte[] data = "Hello, world!".getBytes();
        // DatagramPacket 打包数据
        DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName("localhost"), 10086);
        // 发送
        ds.send(dp);
        // 释放资源
        ds.close();
    }
}
