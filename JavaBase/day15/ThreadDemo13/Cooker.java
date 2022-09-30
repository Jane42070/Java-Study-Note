package JavaBase.day15.ThreadDemo13;

/**
 * @author qilin
 */
public class Cooker extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (!Desk.flag) {
                        // 生产
                        System.out.println(Thread.currentThread().getName() + ": 生产汉堡包");
                        try {
                            Thread.sleep(400);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Desk.flag = true;
                        Desk.lock.notifyAll();
                    } else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
