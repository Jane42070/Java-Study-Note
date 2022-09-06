package JavaBase.day15.ThreadDemo9;

/**
 * @author qilin
 */
public class Ticket implements Runnable {
    /**
     * 票的数量
     */
    private int ticketCount = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        int ticketSold = 0;
        while (true) {
            synchronized (obj) {
                if (ticketCount <= 0) {
                    break;
                } else {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    ticketCount--;
                    ticketSold++;
                    System.out.println(Thread.currentThread().getName() + ": " + "卖了一张票, 还剩" + ticketCount + "张票");
                }
            }
        }
        System.out.println("票卖完了" + " " + Thread.currentThread().getName() + "共卖出" + ticketSold + "张票");
    }
}
