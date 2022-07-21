package day07.StringApi01;

/**
 * StringDemo02
 * int length(): 返回字符串长度
 * boolean equals(Object anOject): 将此字符串与指定的对象进行比较
 * boolean equalsIgnoreCase(String anotherString):
 * 将此字符串与另一个字符串比较，忽略大小写
 * String trim(): 返回一个字符串，其值为去掉前后空格的字符串
 * 
 * @author qilin
 */
public class StringDemo02 {
	public static void main(String[] args) {
		String s1 = "itheima";
		String s2 = "itheima";
		String s3 = "itheima";

		// boolean equals(Object anOject)
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		// boolean equalsIgnoreCase(String anotherString)
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));

		String s4 = " itheima ";
		// String trim()
		System.out.println(s4);
		System.out.println(s4.trim());
		// 只能去除字符串前后空格
		String s5 = "it heima";
		System.out.println(s5.trim());
	}
}
