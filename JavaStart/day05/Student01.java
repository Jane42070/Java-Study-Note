package JavaStart.day05;

public class Student01 {
    private int stu_id;
    private int stu_height;
    private String stu_name;
    private String stu_gender;

    // 构造方法：构造对象
    // 构造方法创建：如果没有给出构造方法，系统会默认给出一个无参的构造方法
    // 构造方法可以有多个
    // 无参构造方法创建后可以创建set方法给对象赋值
    // 含参构造方法可以在创建的时候给对象赋值
    // 构造方法的重载，如果自定义了带参构造方法，还要使用无参数构造方法就必须再写一个无参数构造方法
    public Student01() {
        System.out.println("无参构造方法");
    }

    public Student01(String stu_name) {
        this.stu_name = stu_name;
    }

    public Student01(int stu_id) {
        this.stu_id = stu_id;
    }

    public void setInfo(int stu_id, int stu_height, String stu_gender, String stu_name) {
        if (stu_gender.equals("male") || stu_gender.equals("female")) {
            this.stu_gender = stu_gender;
        } else {
            System.out.println("学生性别必须是 male 或者 female");
            return;
        }
        if (stu_name.length() <= 5 && stu_name.length() >= 1) {
            this.stu_name = stu_name;
        } else {
            System.out.println("学生名字长度必须大于0且小于6");
            return;
        }
        if (stu_id <= 999999 && stu_id >= 100000) {
            this.stu_id = stu_id;
        } else {
            System.out.println("学生ID是六位数字");
            return;
        }
        if (stu_height >= 100) {
            this.stu_height = stu_height;
        } else {
            System.out.println("请输入正确的身高");
            return;
        }
    }

    public void getInfo() {
        System.out.println(stu_id + "," + stu_name + "," + stu_gender + "," + stu_height);
    }

    public void study() {
        System.out.println(stu_name + "正在学习");
    }

    public void doHomework() {
        System.out.println(stu_name + "正在做家庭作业");
    }
}
