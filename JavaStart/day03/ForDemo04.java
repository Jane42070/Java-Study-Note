// 逢七过
// 数字包含7，或者7的倍数，则过，不能说出该数
public class ForDemo04 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7) {
				System.out.println("过");
			} else {
				System.out.println(i);
			}
		}
	}
}
