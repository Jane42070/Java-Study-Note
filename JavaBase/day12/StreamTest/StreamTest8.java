package JavaBase.day12.StreamTest;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 现有两个 ArrayList 集合，分别有 6 名男演员和 6 名女演员，要求完成如下操作
 * 男演员只要名字为 3 个字的前两人
 * 女演员只要姓杨的，且不要第一个
 * 把过滤后的男演员和女演员合并到一起
 * 把上一步操作后的元素为构造方法的参数创建演员对象，遍历数据
 * 演员类 Actor 里要有成员变量，一个带参构造，以及成员对应的 get/set 方法
 *
 * @author qilin
 */
public class StreamTest8 {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("张国立");
        manList.add("张晋");
        manList.add("刘烨");
        manList.add("郑伊健");
        manList.add("徐峥");
        manList.add("王宝强");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("郑爽");
        womanList.add("杨紫");
        womanList.add("关晓彤");
        womanList.add("张天爱");
        womanList.add("杨幂");
        womanList.add("赵丽颖");

        // 男演员只要名字为 3 个字的前两人
        Stream<String> man = manList.stream().filter(m -> m.length() == 3)
                .limit(2);

        // 女演员只要姓杨的，且不要第一个
        Stream<String> woman = womanList.stream().filter(m -> m.startsWith("杨"))
                .skip(1);

        System.out.println("----------------");

        ArrayList<Actor> ActorList = new ArrayList<>();

        Stream.concat(man, woman).forEach(m -> ActorList.add(new Actor(m)));

        System.out.println(ActorList);
    }
}

class Actor {
    private String name;

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }
}
