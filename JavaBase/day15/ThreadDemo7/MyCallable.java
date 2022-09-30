package JavaBase.day15.ThreadDemo7;

import java.util.concurrent.Callable;

/**
 * @author qilin
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        return "Completed";
    }
}
