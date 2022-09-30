package JavaBase.day15.ThreadDemo7;

import java.util.concurrent.FutureTask;

/**
 * @author qilin
 */
public class Demo {
    public static void main(String[] args) {
        MyCallable mc1 = new MyCallable();
        MyCallable mc2 = new MyCallable();
        FutureTask<String> ft1 = new FutureTask<>(mc1);
        FutureTask<String> ft2 = new FutureTask<>(mc2);
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);
        t1.setName("福瑞婷1号");
        System.out.println(t1.getPriority());
        t1.setPriority(1);
        t2.setName("福瑞婷2号");
        System.out.println(t2.getPriority());
        t1.setPriority(10);
        t1.start();
        t2.start();
    }
}
