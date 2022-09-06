package JavaBase.day15.ClassLoaderDemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * public static ClassLoader getSystemClassLoader()    获取系统类加载器
 * public InputStream getResourceAsStream(String name) 加载某一个资源文件
 *
 * @author qilin
 */
public class ClassLoaderDemo2 {
    public static void main(String[] args) throws IOException {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        // 利用加载器加载一个指定的文件
        // 参数：文件的路径
        // 返回值：字节流
        InputStream resourceAsStream = systemClassLoader.getResourceAsStream("JavaBase/day14/propertiesDemo/prop.properties");
        Properties properties = new Properties();
        properties.load(resourceAsStream);

        System.out.println(properties);
        assert resourceAsStream != null;
        resourceAsStream.close();
    }
}
