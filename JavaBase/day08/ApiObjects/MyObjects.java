package JavaBase.day08.ApiObjects;

import java.util.Objects;

public class MyObjects {
    public static void main(String[] args) {
        // public static String toString(对象) 返回参数中对象的字符串表示形式
        Student s = new Student("小罗", 50);
        String result = Objects.toString(s);
        System.out.println(result);

        // public static String toString(对象, 默认字符串) 返回对象的字符串表示形式
        // 如果对象为空，则返回第二个参数
        Student s1 = new Student("小花", 23);
        result = Objects.toString(s1, "随便写一个");
        System.out.println(result);

        // public static boolean isNull(对象) 判断对象是否为空
        Student s2 = null;
        boolean isNull = Objects.isNull(s2);
        System.out.println(isNull);

        // public static boolean nonNull(对象) 判断对象是否为空
        Student s3 = new Student();
        boolean nonNull = Objects.nonNull(s3);
        System.out.println(nonNull);
    }
}
