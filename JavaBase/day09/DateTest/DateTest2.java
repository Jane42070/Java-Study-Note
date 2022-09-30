package JavaBase.day09.DateTest;

import java.util.Date;

/**
 * @author qilin
 * - public long getTime() 获取时间对象的毫秒值
 * - public void setTime(long time) 设置时间，传递毫秒值
 */
public class DateTest2 {
    public static void main(String[] args) {
        method1();
        Date date1 = new Date();
        date1.setTime(0L);
        System.out.println(date1);
    }

    private static void method1() {
        Date date1 = new Date();
        // 获取date对象的毫秒值
        long time = date1.getTime();
        System.out.println(time);
        long time2 = System.currentTimeMillis();
        System.out.println(time2);
    }
}
