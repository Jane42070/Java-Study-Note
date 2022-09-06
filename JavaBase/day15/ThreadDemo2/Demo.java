package JavaBase.day15.ThreadDemo2;

/**
 * @author qilin
 */
public class Demo {
    public static void main(String[] args) {
        // 创建了一个参数的对象
        MyRunnable mr = new MyRunnable();
        // 创建了一个线程对象，并把参数传给线程
        // 启动时候，执行参数里面的方法
        Thread t = new Thread(mr);
        // 开启线程
        t.start();

        MyRunnable mr2 = new MyRunnable();
        Thread t2 = new Thread(mr2);
        t2.start();
    }
}
