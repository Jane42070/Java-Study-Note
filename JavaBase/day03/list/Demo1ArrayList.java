package JavaBase.day03.list;

import java.util.ArrayList;

/**
 * ArrayList 构造方法
 * ArrayList() 构造一个初始容量为10的空列表
 * <p>
 * 成员方法：
 * 添加：
 * boolean add(E e) 将指定元素添加到此列表的尾部
 * <p>
 * void add(int index, E element) 将指定元素插入此列表中的指定位置
 * <p>
 * 注意：
 * 集合容器如果没有加入尖括号，就可以存储任意数据类型
 * <p>
 * <>范型：对集合容器中存储的数据类型进行限制
 *
 * @author qilin
 */
public class Demo1ArrayList {
    public static void main(String[] args) {
        // 创建集合容器对象
        ArrayList<String> list = new ArrayList<>();

        // 调用对象Add 方法向容器中添加数据
        list.add("ABC");
        list.add("123");
        list.add("true");

        list.add(0, "666");

        System.out.println(list);
    }
}
