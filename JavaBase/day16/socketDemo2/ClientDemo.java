package JavaBase.day16.socketDemo2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author qilin
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 10010);

        OutputStream os = socket.getOutputStream();

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入上传文件路径：");
        String path = sc.next();

        sendFile(os, path);
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        receiveResult(is);

        is.close();
        socket.close();
    }

    private static void receiveResult(InputStream is) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void sendFile(OutputStream os, String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
        String s;
        while ((s = reader.readLine()) != null) {
            writer.write(s);
        }
    }
}