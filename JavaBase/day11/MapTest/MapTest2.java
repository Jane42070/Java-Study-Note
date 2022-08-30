package JavaBase.day11.MapTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qilin
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // V put(K key, V value) 添加元素
        // 如果添加的键不存在，那么会把键值对都添加到集合中
        // 如果存在，则替换值
        putMap(map);

        // V remove(Object key) 删除元素
        // removeMap(map);

        // void clear() 清空所有键值对
        // clearMap(map);

        // boolean containsKey(Object key) 判断集合是否有指定的键
        boolean result = map.containsKey("2018211921");
        System.out.println(result);

        // boolean containsValue(Object value) 判断集合是否包含指定的值
        boolean result2 = map.containsValue("贾余东");
        System.out.println(result2);

        // boolean isEmpty() 判断集合是否为空
        boolean result3 = map.isEmpty();
        System.out.println(result3);

        // int size() 集合的长度，键值对的个数
        int result4 = map.size();
        System.out.println(result4);
    }

    private static void putMap(Map<String, String> map) {
        map.put("2018211920", "贾余东");
        map.put("2018211921", "蹇棋林");
        map.put("2018211922", "梁伟");
        String ret = map.put("2018211921", "aaa");
        System.out.println(ret);
        System.out.println(map);
    }

    private static void removeMap(Map<String, String> map) {
        String remove = map.remove("2018211921");
        System.out.println(remove);
        System.out.println(map);
    }

    private static void clearMap(Map<String, String> map) {
        map.clear();
        System.out.println(map);
    }
}
