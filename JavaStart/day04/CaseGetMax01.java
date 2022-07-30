// 需求：设计一个方法用于获取三个整数较大值，调用方法，把结果在控制台输出
public class CaseGetMax01 {
	public static void main(String[] args) {
		System.out.println(getMax(25, 76, -24));
	}

	public static int getMax(int a, int b, int c) {
		/* if (a > b && a > c) { */
		/* return a; */
		/* } else if (b > a && b > c) { */
		/* return b; */
		/* } else { */
		/* return c; */
		/* } */
		int tempMax = a > b ? a : b;
		int Max = tempMax > c ? tempMax : c;
		return Max;
	}
}
