// 同一个类中方法名相同，参数不同，构成方法重载
public class MethodReload {
	public static void main(String[] args) {
		System.out.println(sum(10, 20));
		System.out.println(sum(10.50, 20.50));
		System.out.println(sum(10, 20, 30));
	}

	// 需求：求两个int类型数据和的方法
	public static int sum(int a, int b) {
		return a + b;
	}

	// 需求：求两个double类型数据和的方法
	public static double sum(double a, double b) {
		return a + b;
	}

	// 需求：求三个int类型数据和的方法
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
