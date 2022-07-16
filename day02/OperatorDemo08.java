// 三元运算符与if语句的区别
public class OperatorDemo08 {
	public static void main(String[] args) {
		// 定义两个int类型变量
		int a = 10;
		int b = 20;
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("较大的值是" + max);

		// 三元运算符实现
		int max1 = a > b ? a : b;
		System.out.println("较大的值是" + max1);
	}
}
