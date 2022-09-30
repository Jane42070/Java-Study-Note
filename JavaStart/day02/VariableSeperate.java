public class VariableSeperate {
	public static void main(String[] args) {
		// 需求：定义一个数，将其分为个位，十位，百位，输出在控制台
		int num = 456;
		System.out.println(num / 100);
		/* System.out.println((num % 100 - num % 10) / 10); */
		System.out.println(num / 10 % 10);
		System.out.println(num % 10);
	}
}
