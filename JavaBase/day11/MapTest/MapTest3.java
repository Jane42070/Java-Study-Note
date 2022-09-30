package JavaBase.day11.MapTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author qilin
 */
public class MapTest3 {
    public static void main(String[] args) {
        // 创建集合并添加元素
        Map<String, String> map = new HashMap<>();

        map.put("1丈夫", "1妻子");
        map.put("2丈夫", "2妻子");
        map.put("3丈夫", "3妻子");
        map.put("4丈夫", "4妻子");

        // 获取到所有键
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s + "-" + map.get(s));
        }
    }
}
