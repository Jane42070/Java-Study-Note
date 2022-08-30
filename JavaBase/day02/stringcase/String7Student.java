package JavaBase.day02.stringcase;

import static java.lang.Integer.parseInt;

public class String7Student {
    private String name;
    private int age;

    public String7Student() {

    }

    public String7Student(String info) {
        String[] array = info.split(",");
        setName(array[0]);
        setAge(parseInt(array[1]));
        System.out.println("姓名：" + getName() + "," + "年龄：" + getAge() + "");
    }

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
