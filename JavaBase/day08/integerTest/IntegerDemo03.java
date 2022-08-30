package JavaBase.day08.integerTest;

/**
 * @author qilin
 */
public class IntegerDemo03 {
    public static void main(String[] args) {
        String s1 = "100";
        int i1 = 200;
        // 字符串+任意数据类型，结果都是一个字符串
        System.out.println(i1 + s1);

        i1 += Integer.parseInt(s1);
        System.out.println(i1);

        // int -> String
        // 方式一：+""
        int i3 = 100;
        String s2 = i3 + "";
        System.out.println(s2 + 100);

        // 方式二：可以调用String类中的valueOf方法
        String s3 = String.valueOf(i3);
        System.out.println(s3 + 100);
    }
}
