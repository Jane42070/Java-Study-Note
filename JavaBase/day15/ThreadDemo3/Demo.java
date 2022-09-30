package JavaBase.day15.ThreadDemo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author qilin
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 线程开启之后需要执行里面的 call 方法
        MyCallable mc = new MyCallable();
        // Thread t1 = new Thread(mc);
        // 可以获取线程执行完毕之后的结果，也可以作为参数传递给 Thread 对象
        FutureTask<String> ft = new FutureTask<String>(mc);

        // 创建线程对象
        Thread t1 = new Thread(ft);
        String result = ft.get();
        t1.start();

        System.out.println(result);
    }
}
