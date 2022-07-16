/* 数值相加 */
public class VariableAdd {
	public static void main(String[] args) {
		int a = 10;
		double b = 13.14;
		// 隐式转换
		// 把一个表示数据范围小的数值或者变量赋值给另一个表示数据范围大的变量
		System.out.println(a + b);

		// 强制类型转换
		int c = (int) (a + b);
		// 会丢失数据
		System.out.println(c);
		/* double d = a + b; */
		short s = 10;
		int i = 20;
		c = s + i;
		short ss = (short) (s + i);
		System.out.println(c);
		System.out.println(ss);
	}
}
