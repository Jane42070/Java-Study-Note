package JavaBase.day15.ThreadDemo8;

/**
 * @author qilin
 */
public class Demo {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();

        mt1.setName("女神");
        mt2.setName("有尊严的舔狗");
        // 把第二个线程设置为守护线程
        // 当普通线程执行完毕后，他也没有执行下去的必要了
        mt2.setDaemon(true);

        mt1.start();
        mt2.start();
    }
}
