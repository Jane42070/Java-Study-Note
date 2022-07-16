// 需求：给出年龄，通过程序判断是否属于青年人
public class IfTest03 {
	public static void main(String[] args) {
		int age = 22;
		if (age >= 18 && age <= 65) {
			System.out.println("是青年人");
		} else {
			System.out.println("不是青年人");
		}
	}
}
