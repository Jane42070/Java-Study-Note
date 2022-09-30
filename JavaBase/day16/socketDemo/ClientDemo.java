package JavaBase.day16.socketDemo;

import java.io.*;
import java.net.Socket;

/**
 * @author qilin
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 10010);
        OutputStream os = socket.getOutputStream();
        os.write("Hello!".getBytes());
        // 如果在这里关流，整个 socket 就将无法使用
        // os.close();
        // 仅仅关闭输出流，并写一个结束标记，对socket没有任何影响
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
/*
        int b;
        while ((b = reader.read()) != -1) {
            System.out.println((char) b);
        }
*/
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        is.close();
        socket.close();
    }
}
