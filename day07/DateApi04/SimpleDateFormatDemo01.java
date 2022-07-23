package day07.DateApi04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormatDemo01
 *
 * @author qilin
 */
public class SimpleDateFormatDemo01 {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		/* SimpleDateFormat sdf = new SimpleDateFormat(); */
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY年MM月dd日HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);

		// 解析（从 String 到 Date）
		String ss = "2021-10-27 11:11:11";
		SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		Date dd = sdf1.parse(ss);
		System.out.println(dd);
	}
}
