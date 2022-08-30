package JavaBase.day08.integerTest;

/**
 * 需求：有一个字符串"91 27 46 38 50"，把其中每一个数存到int类型数组中
 *
 * @author qilin
 */
public class IntegerCase {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
