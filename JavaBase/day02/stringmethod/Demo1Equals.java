package JavaBase.day02.stringmethod;

/**
 * Demo1Equals
 *
 * @author qilin
 */
public class Demo1Equals {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "ABC";
		String s3 = "abc";
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
