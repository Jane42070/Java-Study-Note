package JavaBase.day08.ArrayAdvanceTest.FactorialTest;

/**
 * 求阶乘
 * @author qilin
 */
public class FactorialTest3 {
    public static void main(String[] args) {
        int pow = getPow(5);
        System.out.println("Pow: " + pow);
    }

    private static int getPow(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * getPow(i - 1);
        }
    }
}
