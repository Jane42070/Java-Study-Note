package JavaBase.day14.propertiesDemo;

import java.util.Properties;
import java.util.Set;

/**
 * @author qilin
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        // prop.setProperty(key, value);
        Properties prop = new Properties();
        prop.setProperty("江苏", "南京");
        prop.setProperty("安徽", "南京");
        prop.setProperty("山东", "济南");

        System.out.println(prop);

        // prop.getProperty(key);
        System.out.println(prop.getProperty("江苏"));

        // Set<String> stringPropertyNames() --- keySet
        // 从该属性列表中返回一个不可修改的键集，其中键集对应的值是字符串
        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key + "=" + prop.getProperty(key));
        }
    }
}
