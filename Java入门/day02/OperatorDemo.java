public class OperatorDemo {
	public static void main(String[] args) {
		int a = 6;
		int b = 4;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// 整数相除只能得到整数，要想得到小数，必须有浮点数的参与
		System.out.println(6.00 / 4);
	}
}
