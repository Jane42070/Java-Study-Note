package JavaBase.day15.ThreadDem10;

/**
 * @author qilin
 */
public class Demo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setName("一号窗口");
        t2.setName("二号窗口");
        t3.setName("三号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
