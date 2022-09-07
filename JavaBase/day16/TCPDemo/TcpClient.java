package JavaBase.day16.TCPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author qilin
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个 Socket 对象
        ServerSocket ss = new ServerSocket(10000);
        // 2. 等待客户端连接
        Socket accept = ss.accept();
        // 3. 获得输入流对象
        InputStream is = accept.getInputStream();
        int b;
        while ((b = is.read()) != -1) {
            System.out.println((char) b);
        }

        is.close();
        ss.close();
    }
}
