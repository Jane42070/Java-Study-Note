package JavaBase.day11.HashSetTest;

/**
 * 计算哈希值
 *
 * @author qilin
 */
public class HashSetTest2 {
    public static void main(String[] args) {
        Student s1 = new Student("小智", 23);
        Student s2 = new Student("小美", 22);

        // 在 Object 类中是根据对象的地址值计算出来的哈希值
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
