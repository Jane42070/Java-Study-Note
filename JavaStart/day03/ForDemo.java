// 需求：循环输出1-5
public class ForDemo {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		// i += 2
		for (int i = 1; i <= 5; i++, i++) {
			System.out.println(i);
		}
		// i -= 1
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
