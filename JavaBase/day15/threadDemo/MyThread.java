package JavaBase.day15.threadDemo;

/**
 * @author qilin
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        // 代码是线程在开启后执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println("线程开启了..." + i);
        }
    }
}