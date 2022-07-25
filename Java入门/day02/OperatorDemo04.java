/* 赋值运算符 */
public class OperatorDemo04 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a:" + a);

		// += : 把左边和右边的数据相加，最后把结果赋值给左边
		a = a + 20;
		System.out.println(a);

		// 注意：扩展的赋值运算符底层隐含了强制类型转换
		short s = 1;
		s = (short) (s + 2);
		/* s += 2; */
		System.out.println(s);
	}
}
