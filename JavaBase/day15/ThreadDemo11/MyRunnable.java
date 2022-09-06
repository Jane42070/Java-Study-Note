package JavaBase.day15.ThreadDemo11;

/**
 * @author qilin
 */
public class MyRunnable implements Runnable {
    private int ticketCount = 100;

    @Override
    public void run() {
        int ticketSold = 0;
        while (true) {
            if (Thread.currentThread().getName().equals("一号窗口")) {
                // 同步代码块
                synchronized (this) {
                    if (ticketCount <= 0) {
                        break;
                    } else {
                        while (true) {
                            if (ticketCount <= 0) {
                                break;
                            } else {
                                ticketCount--;
                                ticketSold++;
                                System.out.println(Thread.currentThread().getName() + ": " + "卖了一张票, 还剩" + ticketCount + "张票");
                            }
                        }
                    }
                }
            } else if (Thread.currentThread().getName().equals("二号窗口")) {
                // 同步方法
                boolean result = synchronizedMethod();
                if (result) {
                    break;
                }
            } else {
                boolean result = synchronizedMethod();
                if (result) {
                    break;
                }
            }
        }
    }

    private synchronized boolean synchronizedMethod() {
        if (ticketCount <= 0) {
            return true;
        } else {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketCount--;
            System.out.println(Thread.currentThread().getName() + ": " + "卖了一张票, 还剩" + ticketCount + "张票");
            return false;
        }
    }
}
