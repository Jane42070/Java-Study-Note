package JavaBase.day15.ThreadDemo3;

import java.util.concurrent.Callable;

/**
 * @author qilin
 */
public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println("跟女孩表白" + i);
        }

        // 线程完成之后的结果返回
        return "答应";
    }
}
