package JavaBase.day05.extendsConstructor;

// 每一个类默认继承 Object类
public class Person extends Object {
    private String name;
    private int age;

    int num = 10;

    public Person() {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    public Person() {
//    }
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    /*
        public Person() {
            System.out.println("父类无参构造方法");
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("父类有参构造方法");
        }
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
