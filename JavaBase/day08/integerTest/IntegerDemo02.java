package JavaBase.day08.integerTest;

/**
 * @author qilin
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
        Integer i1 = 100;
        //         = 默认是一个基本数据类型
        // jdk1.5 的特性 --- 自动装箱
        // 自动：Java底层会帮我们自动的调用valueOf方法
        System.out.println(i1);

        // jdk1.5的特性 --- 自动拆箱
        // 拆箱：把一个包装类型 变成对应的基本数据类型
        int i2 = i1;
        System.out.println(i2);

        // 自动装箱机制
        Integer i3 = 100;
        /*
            i3 = i3 + 200;
            将i3对象变成基本数据类型100
            100+200=300
            把基本数据类型300再次自动装箱变成Integer对象赋值给i3
        */
        i3 += 200;
        System.out.println(i3);

        // 细节
        Integer i4 = null;
        if (i4 != null) {
            i4 += 200;
        }
        System.out.println(i4);
    }
}
