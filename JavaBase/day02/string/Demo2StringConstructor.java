package JavaBase.day02.string;

/**
 * Demo2StringConstructor
 * String 类常见构造方法
 * 注意：String 类比较特殊，打印其对象名的时候，不会出现其内存地址，而是该对象记录的真实内容
 *
 * @author qilin
 */
public class Demo2StringConstructor {
	public static void main(String[] args) {
		// public String() 创建一个空白字符串对象
		String s1 = new String();
		System.out.println(s1);

		// public String(char[] chs) 根据字符数组来创建字符串对象
		char[] chs = { 'a', 'b', 'c' };
		String s2 = new String(chs);
		System.out.println(s2);

		// public String(String original) 根据传入的字符串内容，来创建字符串对象
		String s3 = new String("123");
		System.out.println(s3);
	}
}
