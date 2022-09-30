package JavaBase.day15.ThreadDemo12;

/**
 * @author qilin
 */
public class Demo {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();

        new Thread(() -> {
            while (true) {
                synchronized (objA) {
                    // 线程一
                    synchronized (objB) {
                        System.out.println("小康同学在走路");
                    }
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                synchronized (objB) {
                    // 线程二
                    System.out.println("小薇同学准备走路");
                    synchronized (objA) {
                        System.out.println("小薇同学在走路");
                    }
                }
            }
        }).start();
    }
}
