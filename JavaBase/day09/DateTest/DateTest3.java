package JavaBase.day09.DateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qilin
 */
public class DateTest3 {
    public static void main(String[] args) {
        // 当前时间对象
        Date d = new Date();

        // 创建了一个日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));
    }
}
