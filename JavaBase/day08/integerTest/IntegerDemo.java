package JavaBase.day08.integerTest;

/**
 * @author qilin
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // 需求：判断一个整数是否在 int 类型范围内
        // Integer
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Integer i2 = new Integer(20);
        Integer i = Integer.valueOf("40");
        Integer i1 = Integer.valueOf(200);
        System.out.println(i2);
        System.out.println(i);
        System.out.println(i1);
    }
}
