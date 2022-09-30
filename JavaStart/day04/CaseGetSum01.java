// 需求：求1-n之间的数据和(n>1), 返回求结果。
public class CaseGetSum01 {
	public static void main(String[] args) {
		System.out.println(getSum(1, 100));
	}

	public static int getSum(int a, int b) {
		int sum = 0;
		while (a <= b) {
			sum += a;
			a++;
		}
		return sum;
	}
}
