package JavaBase.day04.com.itheima.edu.info.manager.domain;

/**
 * Teacher 和 Student 的父类
 *
 * @author qilin
 */
public class Person {
    private String id;
    private String name;
    private int age;
    private String birth;

    public Person() {
    }

    public Person(String id, String name, int age, String birth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
