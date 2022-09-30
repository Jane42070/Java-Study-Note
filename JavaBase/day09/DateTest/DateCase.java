package JavaBase.day09.DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qilin
 */
public class DateCase {
    public static void main(String[] args) throws ParseException {
        String jiaTime = "2020-11-11 00:03:47";
        String piTime = "2020-11-11 00:10:11";
        Date jiaDate, piDate;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        jiaDate = sdf.parse(jiaTime);
        piDate = sdf.parse(piTime);

        System.out.println(isJoined(jiaDate, sdf));
        System.out.println(isJoined(piDate, sdf));
    }

    private static boolean isJoined(Date d, SimpleDateFormat sdf) throws ParseException {
        String startTime = "2020-11-11 00:00:00";
        String endTime = "2020-11-11 00:10:00";
        long sTime = sdf.parse(startTime).getTime();
        long eTime= sdf.parse(endTime).getTime();
        long dTime = d.getTime();

        return dTime >= sTime && dTime <= eTime;
    }
}
