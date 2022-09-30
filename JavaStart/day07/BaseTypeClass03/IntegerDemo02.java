package day07.BaseTypeClass03;

/**
 * IntegerDemo02
 * Int 和 String 相互转换
 *
 * @author qilin
 */
public class IntegerDemo02 {
	public static void main(String[] args) {
		// int -- String
		int number = 100;
		// 方式 1
		String s1 = number + "";
		System.out.println(s1);

		// 方式 2
		// static String valueOf(int i)
		String s2 = String.valueOf(number);
		System.out.println(s2);
		System.out.println("---------------------------");

		String s = "100";
		// 方式 1：String --- Integer --- int
		Integer i = Integer.valueOf(s);
		// int intValue() 返回此值 Integer 为 int
		int i1 = i.intValue();
		System.out.println(i1);

		// 方式 2
		int y = Integer.parseInt(s);
		System.out.println(y);
	}
}
