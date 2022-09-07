package JavaBase.day16.EnumDemo2;

import JavaBase.day16.myEnum.Season;

/**
 * @author qilin
 */
public class Demo2 {
    public static void main(String[] args) {
        // String name(); 获取枚举项的名称
        String name = Season.SPRING.name();
        System.out.println(name);
        // int ordinal(); 返回枚举项在枚举类中的索引值
        int ordinal = Season.WINTER.ordinal();
        System.out.println(ordinal);
        // int compareTo(E o); 比较两个枚举项，返回的是枚举项的差值
        int i = Season.WINTER.compareTo(Season.AUTUMN);
        System.out.println(i);
        // String toString(); 返回枚举常量的名称
        String s = Season.WINTER.toString();
        System.out.println(s);
        // static <T> T valueOf(Class<T> type, String name);
        // 获取指定枚举类中的指定名称的枚举值
        Season season = Enum.valueOf(Season.class, "SPRING");
        System.out.println(season == Season.SPRING);
        // values() 获得所有的枚举项
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }
    }
}
