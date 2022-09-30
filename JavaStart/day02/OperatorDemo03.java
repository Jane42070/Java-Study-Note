/* 字符串相加 */
public class OperatorDemo03 {
	public static void main(String[] args) {
		// 当算数运算符出现字符串时，就是字符串拼接，不是底层数值相加
		System.out.println("it" + "Heima");
		System.out.println("itheima" + 666);
		System.out.println(666 + "itheima");

		System.out.println("itheima" + 6 + 66);
		System.out.println(1 + 99 + "年itheima");
		System.out.println("你好");
	}
}
