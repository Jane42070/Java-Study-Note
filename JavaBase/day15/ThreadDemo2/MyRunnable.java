package JavaBase.day15.ThreadDemo2;

/**
 * @author qilin
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("第二种方式实现多线程..." + i);
        }
    }
}
