package JavaBase.day15.threadDemo;

/**
 * @author qilin
 */
public class ThreadDemo {
    public static void main(String[] args) {
        // 创建一个线程对象
        MyThread t1 = new MyThread();
        // 创建一个线程对象
        MyThread t2 = new MyThread();
        // 开启一条线程
        t1.start();
        // 开启第二条线程
        t2.start();
    }
}
