package JavaBase.day15.ThreadDemo13;

/**
 * @author qilin
 */
public class Desk {
    /**
     * 定义一个标记
     * 如果为true，表示桌子上有汉堡，允许吃货执行
     * 如果为false，没有汉堡，允许厨师执行
     */
    public static boolean flag = false;

    /**
     * 汉堡包的总数量
     */
    public static int count = 10;

    /**
     * 锁对象
     */
    public static final Object lock = new Object();
}
