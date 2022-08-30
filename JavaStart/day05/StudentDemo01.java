package JavaStart.day05;

public class StudentDemo01 {
	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println(stu);
		System.out.println(stu.age);
		System.out.println(stu.name);
		stu.name = "福瑞婷";
		stu.age = 12;
		stu.study();
		stu.doHomework();
	}
}
