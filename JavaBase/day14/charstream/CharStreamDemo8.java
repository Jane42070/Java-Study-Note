package JavaBase.day14.charstream;

import java.io.*;

/**
 * @author qilin
 */
public class CharStreamDemo8 {
    public static void main(String[] args) throws IOException {
        // BufferedWriter ： newLine 跨平台换行符
        BufferedWriter bw = new BufferedWriter(new FileWriter("JavaBase/day14/charstream/a.txt", true));
        bw.newLine();
        bw.write("Hello World");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("JavaBase/day14/charstream/a.txt"));
        do {
            System.out.println(br.readLine());
        } while (br.readLine() != null);

        br.close();
    }
}
