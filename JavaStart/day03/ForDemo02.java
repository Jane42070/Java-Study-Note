// 输出水仙花数，并统计个数
public class ForDemo02 {
	public static void main(String[] args) {
		// 水仙花数定义：三位数，个十百位的数字立方和等于原数
		int j, k, l, num = 0;
		for (int i = 100; i < 1000; i++) {
			j = i % 10;
			k = i / 10 % 10;
			l = i / 100;
			if (j * j * j + k * k * k + l * l * l == i) {
				num++;
				System.out.println(i + "是水仙花树");
			}
		}
		System.out.println("共有" + num + "个水仙花数");
	}
}
