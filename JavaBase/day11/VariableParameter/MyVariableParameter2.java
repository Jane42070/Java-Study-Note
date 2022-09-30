package JavaBase.day11.VariableParameter;

/**
 * 需求：实现定义一个方法求N个数的和
 * 可变参数实现
 *
 * @author qilin
 */
public class MyVariableParameter2 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
    }

    public static int getSum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

/*
    @Override
    public static int getSum(int number, int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum + number;
    }
*/
}
