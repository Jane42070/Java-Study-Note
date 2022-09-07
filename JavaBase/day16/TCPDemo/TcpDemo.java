package JavaBase.day16.TCPDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author qilin
 */
public class TcpDemo {
    public static void main(String[] args) throws IOException {
        // 创建 Socket 对象
        Socket socket = new Socket("localhost", 10000);
        // 获取一个IO流写数据
        OutputStream os = socket.getOutputStream();
        os.write("Hello, world!".getBytes());
        os.close();
        socket.close();
    }
}
