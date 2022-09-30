package JavaBase.day06.testInterface5;

public interface Inter {
    public default void start() {
        System.out.println("Start 执行");
        log();
    }

    public default void end() {
        System.out.println("end 执行");
        log();
    }

    public default void log() {
        System.out.println("日志记录（模拟）");
    }

    public static void check() {
        System.out.println("权限校验（模拟）");
    }

    public static void open() {
        System.out.println("open 执行");
        check();
    }

    public static void close() {
        System.out.println("close 执行");
        check();
    }
}