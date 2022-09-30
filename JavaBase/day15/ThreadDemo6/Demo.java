package JavaBase.day15.ThreadDemo6;

/**
 * @author qilin
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("睡觉前");
        Thread.sleep(1000);
        System.out.println("睡醒了");

        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        t1.start();
    }
}
