package JavaBase.day03.list.StudentManageSystem.domain;

public class Student {
    private String number;
    private String name;
    private int age;

    private String brith;

    public Student(String number, String name, int age, String brith) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.brith = brith;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }
}
