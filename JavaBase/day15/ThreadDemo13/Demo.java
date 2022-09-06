package JavaBase.day15.ThreadDemo13;

/**
 * 消费者步骤
 * 1. 判断桌上是否有汉堡
 * 2. 如果没有就等待
 * 3. 如果有就开吃
 * 4. 吃完之后，没有了，叫醒生产者继续生产
 * 生产者
 * 1. 判断桌上是否有汉堡
 * 2. 没有就生产
 * 3. 把汉堡放在桌子上
 * 4. 叫醒等待的消费者开吃
 *
 * @author qilin
 */
public class Demo {
    public static void main(String[] args) {
        Foodie f = new Foodie();
        f.setName("吃货");
        Cooker c = new Cooker();
        c.setName("厨师");
        f.start();
        c.start();
    }
}
