package day05;

public class Student01Demo01 {
    public static void main(String[] args) {
        Student01 stu1 = new Student01();
        stu1.setInfo(201821,177,"male","蹇棋林");
        stu1.getInfo();

        Student01 stu2 = new Student01("福瑞婷");
        stu2.getInfo();

        Student01 stu3 = new Student01(202212);
        stu3.getInfo();

        Student01 stu4 = new Student01();
        stu4.getInfo();
    }
}
