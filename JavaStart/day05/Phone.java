package JavaStart.day05;

// 类的定义
// 类名：手机（Phone）
// 成员变量：
//	品牌（brand）
//	价格（price）
// 成员方法：
// 打电话（call）
// 发短信（message）
public class Phone {
	String brand;
	int price;

	public void call() {
		System.out.println("打电话中...");
	}

	public void message() {
		System.out.println("发送短信中...");
	}
}
