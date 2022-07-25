// 输出所有五位数的回文数
public class ForDemo03 {
	public static void main(String[] args) {
		int l = 0;
		for (int i = 10000; i <= 99999; i++) {
			int j, k, m, n;
			j = i % 10;
			k = i / 10 % 10;
			/* l = i / 100 % 10; */
			m = i / 1000 % 10;
			n = i / 10000;
			if (j == n && k == m) {
				l++;
				System.out.println(i + "是回文数");
			}
		}
		System.out.println("共有" + l + "个回文数");
	}
}
