package JavaBase.day08.ExceptionTest;

import java.text.SimpleDateFormat;

/**
 * @author qilin
 */
public class ExceptionTest {
    public static void main(String[] args) {
        // java.lang.ArrayIndexOutOfBoundsException
        // int[] arr = {1, 2, 3, 4, 5, 6};
        // System.out.println(arr[10]);

        // java.lang.NullPointerException
        // String s = null;
        // System.out.println(s.equals("haha"));

        // java.text.ParseException
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // sdf.parse("2048-1-1");
    }
}
