// 需求：求和1～5之间的数据
public class ForDemo01 {
	public static void main(String[] args) {
		// 定义一个求和变量，用于保存求和结果
		int sum = 0;

		// 通过for循环实现获取数据1-5
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println("1-5求和结果是：" + sum);
	}
}
