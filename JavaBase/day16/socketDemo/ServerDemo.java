package JavaBase.day16.socketDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author qilin
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10010);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        int b;
        while ((b = is.read()) != -1) {
            System.out.println((char) b);
        }

        OutputStream os = accept.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
        writer.write("你谁啊");
        writer.newLine();
        writer.flush();
        accept.shutdownOutput();

        os.close();
        is.close();
        ss.close();
    }
}
