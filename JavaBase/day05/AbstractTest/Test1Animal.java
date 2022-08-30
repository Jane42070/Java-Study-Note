package JavaBase.day05.AbstractTest;

/**
 * - 案例需求
 * 定义猫类(Cat)和狗类(Dog)
 * 猫类成员方法：eat（猫吃鱼）drink（喝水…）
 * 狗类成员方法：eat（狗吃肉）drink（喝水…）
 * - 实现步骤
 * 1. 猫类和狗类中存在共性内容，应向上抽取出一个动物类（Animal）
 * 2. 父类Animal中，无法将 eat 方法具体实现描述清楚，所以定义为抽象方法
 * 3. 抽象方法需要存活在抽象类中，将Animal定义为抽象类
 * 4. 让 Cat 和 Dog 分别继承 Animal，重写eat方法
 * 5. 测试类中创建 Cat 和 Dog 对象，调用方法测试
 *
 * @author qilin
 */
public class Test1Animal {
    /*
     * 1. 抽象类不能创建对象
     * 2. 抽象类中有构造方法
     * 3. 抽象类的子类
     * A: 必须要重写父类中所有的抽象方法
     * B: 可以将自己也变成一个抽象类
     * 4. 抽象类中的方法
     * 抽象类中可以没有抽象方法，但是有抽象方法的类，一定是抽象类
     *  */
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.drink();

        Cat cat = new Cat();
        cat.eat();
        cat.drink();

        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("未知生物吃泥土");
            }
        };
        a.eat();
    }
}
