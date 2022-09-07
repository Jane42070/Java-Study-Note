package JavaBase.day16.EnumDemo;

import JavaBase.day16.myEnum.Season;

/**
 * @author qilin
 */
public class Demo1 {
    public static void main(String[] args) {
        // 访问指定枚举项
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);

        // 每个枚举项都是该枚举的一个对象
        Season spring = Season.SPRING;

        // 枚举也是一个类，里面也可以定义成员变量
        // 枚举类的第一行必须是枚举项
        // 分号在只有枚举项的时候可以省略

        // 枚举类的构造方法必须是 private 的，默认也是 private 的
        System.out.println(Season.SPRING.getName());
    }
}
