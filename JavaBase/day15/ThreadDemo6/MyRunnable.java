package JavaBase.day15.ThreadDemo6;

/**
 * @author qilin
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
