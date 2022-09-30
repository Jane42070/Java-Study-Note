// 需求：设计一个方法判断是否是水仙花树
public class CaseGetFlower01 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			if (Flower(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean Flower(int num) {
		int a = num % 10;
		int b = num / 10 % 10;
		int c = num / 100 % 10;
		if (a * a * a + b * b * b + c * c * c == num) {
			return true;
		} else {
			return false;
		}
	}
}
