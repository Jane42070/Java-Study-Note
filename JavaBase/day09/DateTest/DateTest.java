package JavaBase.day09.DateTest;

import java.util.Date;

/**
 * @author qilin
 */
public class DateTest {
    public static void main(String[] args) {
        // public Date() 创建一个Date对象，表示默认时间
        // public Date(long date) 创建一个Date对象，表示指定时间
        Date d = new Date();
        // 那么这个时间表示电脑中的当前时间
        System.out.println(d);

        // 从计算机的时间原点开始，过了指定毫秒的那个时间
        Date d2 = new Date(0L);
        System.out.println(d2);
        // 从时间原点开始，过了0毫秒
        // 东八区需+8小时

        Date d3 = new Date(3600L * 1000);
        System.out.println(d3);
    }
}
