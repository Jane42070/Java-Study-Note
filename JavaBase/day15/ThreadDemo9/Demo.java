package JavaBase.day15.ThreadDemo9;

/**
 * @author qilin
 */
public class Demo {
    public static void main(String[] args) {
        // 这样的方法错误，要不就要加上 static
        // method1();
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        t1.setName("一号窗口");
        t2.setName("二号窗口");
        t3.setName("三号窗口");

        t1.start();
        t2.start();
        t3.start();
    }

    private static void method1() {
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();

        Thread t1 = new Thread(ticket1);
        Thread t2 = new Thread(ticket2);
        Thread t3 = new Thread(ticket3);
        t1.setName("一号窗口");
        t1.setName("二号窗口");
        t1.setName("三号窗口");

        t1.start();
        t2.start();
        t3.start();
    }
}
