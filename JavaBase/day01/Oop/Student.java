package JavaBase.day01.Oop;

/**
 * Student
 * 属性：
 * 姓名，年龄，性别
 * 行为：
 * 学习
 *
 * @author qilin
 */
public class Student {
	// 成员变量定义在类中方法外

	String name;
	int age;
	int gender;

	/**
	 * 成员方法去掉 Static关键字
	 */
	public void Study() {
		System.out.println(name + "正在学习...");
	}
}
