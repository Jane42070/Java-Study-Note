package JavaBase.day15.ThreadDemo13;

public class Foodie extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.flag) {
                        /* 有 */
                        System.out.println(Thread.currentThread().getName() + "：吃汉堡包");
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Desk.flag = false;
                        Desk.lock.notifyAll();
                        Desk.count--;
                        System.out.println("汉堡包-1");
                    } else {
                        /*
                          等待
                          使用什么对象当作锁，那么就必须用这个对象去调用等待和唤醒的方法
                          */
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
