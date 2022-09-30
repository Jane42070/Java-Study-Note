package JavaBase.day11.VariableParameter;

/**
 * 定义一个方法，求两个数的和
 * 定义一个方法，求三个数的和
 * 定义一个方法，求 N 个数的和
 *
 * @author qilin
 */
public class MyVariableParameter {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(get2Sum(a, b));
        System.out.println(get3Sum(a, b, c));

        // 在JDK1.5之前，会把所有的数据都先放到一个数组中
        // 我们自己定义的方法，形参只要写一个数组就可以了
        int[] arr = {1, 2, 3, 4, 5};
        int nSum = getNSum(arr);
        System.out.println(nSum);
    }

    public static int get2Sum(int a, int b) {
        return a + b;
    }

    public static int get3Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int getNSum(int[] arr) {
        int nSum = 0;
        for (int i : arr) {
            nSum += i;
        }
        return nSum;
    }
}
