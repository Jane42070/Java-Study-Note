package JavaBase.day14.propertiesDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author qilin
 */
public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
        // void load(Reader reader)
        // 将本地文件中的键值对数据读取到集合中
        Properties prop = new Properties();
        FileReader fr = new FileReader("JavaBase/day14/propertiesDemo/prop.properties");
        prop.load(fr);
        fr.close();
        System.out.println(prop);

        // void store(Writer writer, String comments)
        Properties prop1 = new Properties();
        prop1.put("lisi", "1234");
        prop1.put("wangwu", "12345");

        FileWriter fw = new FileWriter("JavaBase/day14/propertiesDemo/prop.properties");
        prop1.store(fw, null);
        fw.close();
    }
}
