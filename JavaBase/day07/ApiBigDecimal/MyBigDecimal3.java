package JavaBase.day07.ApiBigDecimal;

import java.math.BigDecimal;

/**
 * public BigDecimal add(另一个BigDecimal对象)      加法
 * public BigDecimal subtract(另一个BigDecimal对象) 减法
 * public BigDecimal multiply(另一个BigDecimal对象) 乘法
 * public BigDecimal divide(另一个BigDecimal对象)   除法
 *
 * @author qilin
 */
public class MyBigDecimal3 {
    public static void main(String[] args) {
        // 如果想要进行精确运算，那么请使用字符串的构造
        // BigDecimal bd1 = new BigDecimal(0.1);
        // BigDecimal bd2 = new BigDecimal(0.2);

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        // public BigDecimal add(另一个BigDecimal对象)      加法
        // System.out.println(bd1.add(bd2));
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println("和为" + bd3);

        // System.out.println(0.1 + 0.2);

        // public BigDecimal subtract(另一个BigDecimal对象) 减法
        BigDecimal bd4 = bd2.subtract(bd1);
        System.out.println("差为" + bd4);

        // public BigDecimal multiply(另一个BigDecimal对象) 乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println("积为" + bd5);

        // public BigDecimal divide(另一个BigDecimal对象)   除法
        BigDecimal bd6 = bd1.divide(bd2);
        System.out.println("商为" + bd6);
    }
}
