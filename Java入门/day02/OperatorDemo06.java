// 逻辑运算符
// 与或非
// && || !
public class OperatorDemo06 {
	public static void main(String[] args) {
		// 定义变量 i,j,k
		int i = 10;
		int j = 20;
		int k = 30;

		// 逻辑与：&&
		System.out.println(i > j && i > k);
		System.out.println(i < j && i > k);
		System.out.println(i > j && i < k);
		System.out.println(i < j && i < k);
		System.out.println("------------------");
		// 逻辑或：||
		System.out.println(i > j || i > k);
		System.out.println(i < j || i > k);
		System.out.println(i > j || i < k);
		System.out.println(i < j || i < k);
		System.out.println("------------------");
		// 逻辑非：!
		System.out.println(!(i > j));
		System.out.println(!!(i > j));
		System.out.println(!!!(i > j));
		System.out.println(!!!!(i > j));
	}
}
