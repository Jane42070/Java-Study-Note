package JavaBase.day05.extendsConstructor;

public class Test2 {
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

class Fu {
    int age;

    // 空参构造方法
    public Fu() {
        System.out.println("父类空参构造方法");
    }

    // 带参构造方法
    public Fu(int age) {
        this.age = age;
    }
}

class Zi extends Fu {
    public Zi() {
        // 没有super
        // super();
        // this() 和 super() 都要放到代码的第一行语句，两者不能共存
        this(10);
    }

    public Zi(int age) {
        super(age);
    }
}