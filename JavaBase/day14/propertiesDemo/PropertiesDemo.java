package JavaBase.day14.propertiesDemo;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author qilin
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        // 增
        prop.put("小龙女", "尹志平");
        prop.put("果囊", "杨过");
        prop.put("杀狗", "老刘");
        prop.put("奥特曼", "大谷");
        System.out.println(prop);

        // 删
        prop.remove("小龙女");
        System.out.println(prop);

        // 改
        prop.put("果囊", "杨不过");
        System.out.println(prop);

        // 查
        System.out.println(prop.get("果囊"));
        Set<Object> set = prop.keySet();
        for (Object o : set) {
            System.out.println(prop.get(o));
        }

        Set<Map.Entry<Object, Object>> set1 = prop.entrySet();
        set1.forEach(System.out::println);
    }
}
