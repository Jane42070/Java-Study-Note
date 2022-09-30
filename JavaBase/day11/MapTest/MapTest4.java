package JavaBase.day11.MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author qilin
 */
public class MapTest4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1丈夫", "1妻子");
        map.put("2丈夫", "2妻子");
        map.put("3丈夫", "3妻子");
        map.put("4丈夫", "4妻子");

        // Set 里面装的是键值对对象（Entry对象）
        // Entry 里面装的是键和值
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
