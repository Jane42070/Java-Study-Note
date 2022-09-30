package JavaBase.day02.stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 50000; i++) {
            sb.append(i);
        }

        System.out.println(sb);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
//        method();
    }

    private static void method() {
        // 1970-01-01 00:00:00 到当前经历所过的毫秒值
        long start = System.currentTimeMillis();
        System.out.println(start);

        String s = "";

        for (int i = 1; i <= 50000; i++) {
            s += i;
        }

        System.out.println(s);

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
