package JavaBase.day02.stringbuilder;

/**
 * 需求：将int[] arr转换为字符串数组
 *
 * @author qilin
 */
public class StringBuilderAppend5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String s = ArrayToString(arr);
        System.out.println(s);
    }

    public static String ArrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i : arr) {
            sb.append(i);
            if (i == arr[arr.length - 1]) {
                sb.append("]");
            } else {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
