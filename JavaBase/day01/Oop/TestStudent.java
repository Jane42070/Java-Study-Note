package JavaBase.day01.Oop;

/**
 * TestStudent
 * Student测试类
 *
 * @author qilin
 */
public class TestStudent {
	public static void main(String[] args) {
		/*
		 * 创建学生对象
		 */
		Student stu = new Student();

		/*
		 * 对象名.变量名
		 * null
		 * 0
		 */
		System.out.println(stu.name);
		System.out.println(stu.age);

		stu.name = "Jane";
		stu.age = 22;

		stu.Study();

		// 全类名（包名+类名）
		System.out.println(stu);
	}
}
