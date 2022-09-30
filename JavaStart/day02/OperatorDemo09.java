// switch 语句
public class OperatorDemo09 {
	public static void main(String[] args) {
		int light = 2;
		switch (light) {
			case 1:
				System.out.println("红灯停");
				break;
			case 2:
				System.out.println("绿灯行");
				break;
			case 3:
				System.out.println("黄灯亮了等一等");
				break;
			default:
				System.out.println("交通信号灯故障，请在保证安全的情况下通行");
				break;
		}
	}
}
