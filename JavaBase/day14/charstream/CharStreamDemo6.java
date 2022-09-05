package JavaBase.day14.charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author qilin
 */
public class CharStreamDemo6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("JavaBase/day14/charstream/a.txt"));

        char[] chars = new char[1024];
        while (br.read(chars) != -1) {
            System.out.println(new String(chars));
        }
        br.close();
    }
}
