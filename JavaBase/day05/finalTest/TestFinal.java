package JavaBase.day05.finalTest;

public class TestFinal {
    // final 修饰变量
    // 基本数据类型变量
    //     其值不能被更改
    // 引用数据类型变量
    // 地址值不能被修改，但是可以修改对象的属性值
    public static void main(String[] args) {
        // 常量的命名规范：如果是一个单词，所有字母大写，如果是多个单词，所有字母大写，但是中间需要使用下划线进行分隔
        final int a = 10;
        // a = 20;

        final int MAX = 10;
        final int MAX_VALUE = 20;

        // stu 是引用数据类型变量
        final Student stu = new Student();
        stu.setName("张三");
        stu.setName("李四");

        // 让 stu 重新记录一份内存地址
        // stu = new Student();
    }
}

class Student {
    // final 修饰成员变量 初始化时机
    // 1. 创建的时候，直接给值
    // 2. 在构造方法结束之前，完成赋值
    final int a;
    private String name;
    public Student() {
        a = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
final class Fu {

}

class Zi extends Fu {

}*/
