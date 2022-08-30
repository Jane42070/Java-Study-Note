package JavaBase.day11.MapTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qilin
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(5);

        map.put("2018211920", "贾余东");
        map.put("2018211921", "蹇棋林");
        map.put("2018211922", "梁伟");
        System.out.println(map);
    }
}
