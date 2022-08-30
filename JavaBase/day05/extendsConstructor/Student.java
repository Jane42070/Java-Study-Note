package JavaBase.day05.extendsConstructor;

public class Student extends Person {
    // 子类特有属性
    private int score;

    public Student() {
        super();
    }

    public Student(String name ,int age, int score) {
        super(name, age);
        this.score = score;
    }

//    public Student() {
//        // 子类在初始化之前，一定要先完成父类数据的初始化
//        // 子类在初始化之前，一定要先访问到父类的构造方法，完成父类数据的初始化
//        // 系统在每一个构造方法中，默认隐藏的一句代码 super()
//        super();
//        System.out.println(num);
//        System.out.println("子类无参构造方法");
//    }
//
//    public Student(int score) {
//        super();
//        System.out.println("子类有参构造方法");
//    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
