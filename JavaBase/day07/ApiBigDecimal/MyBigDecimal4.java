package JavaBase.day07.ApiBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyBigDecimal4 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("10.0");
        BigDecimal bd2 = new BigDecimal("3.0");

        // BigDecimal divide = bd1.divide(bd2);
        // System.out.println(divide);
        // 参数一：表示参数运算的另一个对象
        // 参数二：表示小数点后精确到多少位
        // 参数三：舍入模式
        // 进一法、去尾法、四舍五入
        // win, alt + v
        BigDecimal divide = bd1.divide(bd2, 2, BigDecimal.ROUND_UP);
        BigDecimal divide1 = bd1.divide(bd2, 2, BigDecimal.ROUND_FLOOR);
        BigDecimal divide2 = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        System.out.println(divide);
        System.out.println(divide1);
        System.out.println(divide2);
    }
}
