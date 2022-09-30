package JavaBase.day15.ThreadDemo4;

/**
 * @author qilin
 */
public class Demo {
    // 线程是有默认名字的，格式：Thread-编号
    public static void main(String[] args) {
        MyThread t1 = new MyThread("福瑞婷");
        MyThread t2 = new MyThread("老六");

        // t1.setName("福瑞婷");
        // t2.setName("老六");
        t1.start();
        t2.start();
    }
}
