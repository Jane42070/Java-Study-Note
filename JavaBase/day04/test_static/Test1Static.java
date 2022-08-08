package JavaBase.day04.test_static;

/**
 * 1. 被static修饰的成员，会被该类的所有对象所共享
 * 2. 被static修饰的成员，会随着类的加载而加载，优先于对象存在
 * 3. 多了一种调用形式，可以通过类名.进行调用
 * @author qilin */
public class Test1Static {
    public static void main(String[] args) {
        // 3
        Student.school = "悉尼大学";
        Student stu1 = new Student();
        stu1.name = "john";
        stu1.age = 12;
        // stu1.school = "悉尼大学";
        stu1.show();

        Student stu2 = new Student();
        // stu2.school = "北京大学";
        stu2.show();
        stu1.show();

        // 静态方法里只能访问静态成员
        method();
    }

    public static void method() {
        // this：当前对象的使用
        // this 需要在创建对象之后，才会存在，静态存在的时候，对象可能还没有被创建
        // this.name
    }
}
