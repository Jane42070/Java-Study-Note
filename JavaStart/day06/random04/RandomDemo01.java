package day06.random04;

import java.util.Random;

/**
 * Random 的基本使用
 *
 * @author qilin
 */
public class RandomDemo01 {
    public static void main(String[] args) {
        // Random(); 创建一个随机数生成器
        Random rand = new Random();

        // nextInt(int bound); 生成一个int类型随机数，bound表示获取到的随机数在[0,bound)之间
        int a = rand.nextInt(10);
        System.out.println(a);

        // 生成10个随机数
        for (int i = 0; i < 10; i++) {
            int j = rand.nextInt(10);
            System.out.println(j);
        }

        // 获取 1～100 之间的数
        int num = rand.nextInt(100) + 1;
        System.out.println(num);
    }
}
