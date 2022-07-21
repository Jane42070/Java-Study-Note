package day07.DateApi04;

import java.util.Date;

/**
 * DateDemo01
 */
public class DateDemo01 {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);

		// 1s = 1000ms
		Date d2 = new Date(1000 * 60 * 60);
		System.out.println(d2);
	}
}
