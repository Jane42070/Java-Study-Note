package day06.random04;

import java.util.Random;
import java.util.Scanner;

/**
 * Random 猜数字游戏
 * 需求：系统产生1～100之间的数，使用程序实现猜这个数字是多少？
 * 根据不同情况下给出不同的提示
 *
 * @author qilin
 */
public class RandomGuess02 {
    public static void main(String[] args) {
        // 生成1~100随机数
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;

        // Scanner 获取键盘数据
        System.out.println("猜数字游戏开始\n请输入你猜的数字：");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();

        // 开始循环猜数字，知道猜对为止
        while (guess != num) {
            if (guess > num) {
                System.out.println("大了");
            } else {
                System.out.println("小了");
            }
            System.out.println("再猜一次：");
            guess = sc.nextInt();
        }
        System.out.println("猜对了！你真棒！游戏结束...");

    }
}
