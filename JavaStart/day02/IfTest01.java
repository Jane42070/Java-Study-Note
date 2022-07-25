// 需求：给定一个整数，请用程序实现判断该整数是奇数还是偶数
public class IfTest01 {
	public static void main(String[] args) {
		// 1.定义一个int类型整数
		int num = 11;

		// 2.用if语句格式进行判断
		if (num % 2 == 0)
			System.out.println(num + "是偶数");
		else
			System.out.println(num + "是奇数");
	}
}
