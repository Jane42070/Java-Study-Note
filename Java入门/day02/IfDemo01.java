public class IfDemo01 {
	public static void main(String[] args) {
		// 定义一个变量，用来表示绿灯的状态
		boolean isGreen = true;
		boolean isRed = true;
		boolean isYellow = true;

		/*
		 * if (isGreen) {
		 * System.out.println("绿灯行");
		 * }
		 * 
		 * if (isRed) {
		 * System.out.println("红灯停");
		 * }
		 * 
		 * if (isYellow) {
		 * System.out.println("黄灯亮了等一等");
		 * }
		 */

		isGreen = false;
		isRed = false;
		isYellow = false;

		if (isRed) {
			System.out.println("红灯停");
		} else if (isGreen) {
			System.out.println("绿灯行");
		} else if (isYellow) {
			System.out.println("黄灯亮了等一等");
		} else {
			System.out.println("交通信号灯故障，请在保证安全的情况下通行");
		}
	}
}
