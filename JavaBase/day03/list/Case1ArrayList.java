package JavaBase.day03.list;

import java.util.ArrayList;

/**
 * 需求：创建一个存储字符串的集合
 * 存储三个字符串元素
 * 1. 创建集合对象
 * 2. 往集合对象添加字符串对象
 * 3. 遍历集合
 * 4. 获取集合长度
 *
 * @author qilin
 */
public class Case1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
//        for (String s : list) {
//            System.out.println(s);
//        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.size());
    }
}
