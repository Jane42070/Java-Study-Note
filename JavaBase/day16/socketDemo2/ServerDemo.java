package JavaBase.day16.socketDemo2;

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
        OutputStream os = accept.getOutputStream();
        FileWriter writer = new FileWriter("JavaBase/day16/socketDemo2/img.png");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        BufferedWriter clientWriter = new BufferedWriter(new OutputStreamWriter(os));
        String b;
        while ((b = reader.readLine()) != null) {
            writer.write(b);
        }
        writer.close();
        clientWriter.write("接收完毕");
        ss.close();
    }
}
