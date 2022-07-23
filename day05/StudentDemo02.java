package day05;

public class StudentDemo02 {
    public static void main(String[] args) {
        Student stu01 = new Student();
        System.out.println(stu01);
        stu01.age = 12;
        stu01.name = "Jane";
        stu01.doHomework();
        System.out.println(stu01.name + stu01.age);
        Student stu02 = new Student();
        System.out.println(stu02);
        stu02.name = "John";
        stu02.age = 12;
        stu02.doHomework();

        Student stu03 = new Student();
        stu03.name = "John";
        stu03.age = 12;
        // 调用 show 方法
        stu03.show();

        // private variables modify values
        Student stu04 = new Student();
        stu04.name = "John";
        stu04.age = 12;
        System.out.println(stu04.getGender());
        stu04.setGender("male");
        System.out.println(stu04.getGender());
        stu04.setGender("female");
        System.out.println(stu04.getGender());
        stu04.setGender("");

        // this keyword
        System.out.println(stu04.getHight());
        stu04.setHight(178);
        System.out.println(stu04.getHight());
    }
}
