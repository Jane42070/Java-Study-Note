// 需求：手机以旧换新
// 计算不使用以旧换新的花费
// 7988 - 1500
// 计算使用以旧换新的花费
// 7988 * 0.8
// if 语句实现
public class IfTest02 {
	public static void main(String[] args) {
		int phonePrice = 7988 - 1500;
		double oldToNew = 7988 * 0.8;

		if (phonePrice > oldToNew) {
			System.out.println("使用以旧换新便宜");
		} else {
			System.out.println("不使用以旧换新便宜");
		}
	}
}
