package JavaBase.day14.charstream;

import java.io.*;
import java.util.Arrays;

/**
 * @author qilin
 */
public class CharStreamCase2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("JavaBase/day14/charstream/sort.txt"));
        String txt = reader.readLine();
        String[] str = txt.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("JavaBase/day14/charstream/sort.txt", true));
        writer.newLine();
        for (int i : arr) {
            writer.write(String.valueOf(i));
            writer.write(" ");
        }
        writer.flush();
        writer.close();
    }
}
