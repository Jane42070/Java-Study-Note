package JavaBase.day08.ExceptionTest;

/**
 * @author qilin
 */
public class ExceptionTest5 {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr = null;
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        if (arr == null) {
            throw new NullPointerException();
        } else {
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
