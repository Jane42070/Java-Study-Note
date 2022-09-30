package JavaBase.day15.ThreadDem10;

/**
 * @author qilin
 */
public class MyThread extends Thread{
    private static int ticketCount =100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            // 当前线程对象
            synchronized (obj) {
                if (ticketCount <= 0) {
                    break;
                } else {
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName() + ": " + "卖了一张票, 还剩" + ticketCount + "张票");
                }
            }
        }
    }
}
