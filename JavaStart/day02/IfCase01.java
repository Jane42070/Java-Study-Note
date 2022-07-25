public class IfCase01 {
	public static void main(String[] args) {
		int light = 1;
		if (light == 1) {
			System.out.println("红灯停");
		} else if (light == 2) {
			System.out.println("绿灯行");
		} else if (light == 3) {
			System.out.println("黄灯亮了请等一等");
		} else {
			System.out.println("信号灯出现故障，请保证安全通行");
		}
	}
}
