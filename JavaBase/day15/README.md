# 多线程

## 多线程概述

- 指在软件或硬件上实现多个线程并发执行的技术
- 具有多线程能力的计算机因有硬件支持而能够在同一时间执行多个线程，提升性能

### 并发和并行

- 并发：在同一时刻，有多个指令在多个CPU上交替执行
- 并行：在同一时刻，有多个指令在多个CPU上同时执行

### 进程和线程

- 进程：正在运行的软件
	- 独立性：能独立运行的基本单位，同时也是系统分配资源和调度的独立单位
	- 动态性：进程是程序一次执行过程，动态产生的，动态消亡的
	- 并发性：任何进程都可以同其他进程一起并发执行
- 线程：
	- 进程中的单个顺序控制流，是一条执行路径
	- 属于进程
	- 单线程：一个进程如果只有一条执行路径，则称为单线程程序
	- 多线程：一个进程如果有多条执行路径，则称为多线程程序

## 多线程的实现方案

- 继承 Thread 类的方式进行实现
	- 定义一个类 MyThread 继承 Thread 类
	- 在 MyThread 类中重写 run() 方法
- 实现 Runnable 接口的方式进行实现
	- 定义一个类 MyRunnable 实现 Runnable 接口
	- 在 MyRunnable 类中重写 run() 方法
	- 创建 MyRunnable 类的对象
	- 创建 Thread 类的对象，把 MyRunnable 对象作为构造方法的参数
- 利用 Callable 和 Future 接口方式实现
	- 定义一个类 MyCallable 实现 Callable 接口
	- 在 MyCallable 类中重写 call() 方法
	- 创建 MyCallable 对象
	- 创建 Future 的实现类 FutureTask 对象，把 MyCallable 对象作为构造方法的参数
	- 创建 Thread 类的对象，把 FutureTask 对象作为构造方法的参数
	- 启动线程
	- 再调用 get 方法，就可以获取线程结束后的结果

## 两个小问题

- 为什么要重写 run() 方法？
	- 因为run() 是用来封装被线程执行的代码
- run() 方法和 start() 方法的区别？
	- run() 封装线程执行的代码，直接调用，和普通方法调用无区别
	- start() 启动线程，然后由JVM调用此线程的run()方法

## 类加载器

| 方法名                                                  | 说明        |
|------------------------------------------------------|-----------|
| public static ClassLoader getSystemClassLoader()     | 获取系统类加载器  |
| public InputStream getResourceAsStream(String name) | 加载某一个资源文件 |

## 三种实现多线程的方式对比

|            | 优点                     | 缺点                       |
|------------|------------------------|--------------------------|
| 实现Runnable | 扩展性强，实现该接口的同时还可以继承其他的类 | 编程相对复杂，不能直接使用Thread类中的方法 |
| 继承Thread类  | 编程简单，可以直接使用Thread类中的方法 | 拓展性差不能再继承其他类             |

## Thread 类中的常见方法

- 获取和设置线程名称
	- String getName()：返回线程的名称
- Thread 类中设置线程的名字
	- void setName(String name)：将此线程的名称更改为等于参数Name
	- 通过构造方法也可以设置线程名称
- 获取当前线程对象
	- public static Thread currentThread()：返回当前正在执行的线程对象的引用
- 线程休眠
	- public static void sleep(long time)：让线程休眠指定的时间，单位为毫秒

## 线程调度

- 多线程的并发运行：
	- 计算机中的 CPU，在任意时刻只能执行一条机器指令。每个线程只有获得CPU的使用权才能执行代码
	- 各个线程轮流获得CPU的使用权，分别执行各自的任务
- 线程调度两种模型
	- 分时调度，每个线程轮流使用CPU的使用权，平均分配每个线程占用CPU的时间片
	- 抢占式调度，优先让优先级高的线程使用CPU，如果线程优先级相同，那么会随机选择一个，优先级高的线程获取的CPU时间片相对多一些
- 线程优先级
	- public final void setPriority(int newPriority) 设置线程的优先级
	- public final int getPriority() 获取线程的优先级

## 后台线程/守护线程

- public final void setDaemon(boolean on)：设置为守护线程
- 当普通线程执行完毕后，他也没有执行下去的必要了

## 线程安全问题

### 案例

- [卖票](ThreadDemo9/Demo.java)
	- 100张票，三个窗口
	- 设计一个程序模拟卖票
- 卖票出现问题
	- 相同票出现了很多次
	- 出现了负数的票
- 卖票安全问题的解决
	- 为什么会出现问题？
		- 多线程操作共享数据
	- 如何解决多线程安全问题
		- 基本思想：让程序没有安全问题的环境
	- 怎么实现呢？
		- 把多条语句操作共享数据的代码锁起来，让任意时刻只能有一个线程执行即可
		- Java 提供了同步代码块的方式来解决

### 同步代码块

- 锁多条语句操作共享数据，可以使用同步代码块实现
- 格式：

```java
class Ticket {
    @Override
    public void run() {
        synchronized (任意对象) {
            多条语句操作共享数据的代码
        }
    }
}
```

- 默认是打开的，只要有一个线程进去执行代码了，锁就会关闭
- 当线程执行完出来了，锁才会打开
- 同步的好处和弊端
	- 好处：解决了多线程的数据安全问题
	- 弊端：当线程很多时，因为每个线程都会去判断同步上的锁，很耗费资源，无形中降低代码运行效率

### 同步方法

- 把 synchornized 关键字加到方法上
- 格式：
	- 修饰符 synchornized 返回值类型 方法名(方法参数){}
- 同步代码块和同步方法区别
	- 同步代码块可以锁住指定代码，同步方法是锁住方法中所有代码
	- 同步代码块可以指定锁对象，同步方法不能指定锁对象
- 同步方法的锁对象是 this

- 同步静态方法：就是把 synchronized 关键字加到静态方法上
	- 格式：修饰符 static synchronized 返回值类型 方法名(参数列表) {}
- 同步静态锁对象是 类名.class

### Lock 锁

- 同步方法和同步代码块是自动上锁和释放锁，无法清楚看到具体在哪里上锁和释放锁
- 为了更清晰的表达如何加锁和释放锁，提供了Lock对象

- Lock 实现提供比使用 synchronized 方法和语句可以获得更广泛的锁定操作
- Lock中提供了获得锁和释放锁的方法
	- void lock(): 获得锁
	- void unlock(): 释放锁
- Lock 是接口不能实例化，这里采用它的实现类 ReentrantLock 来实例化
	- ReentrantLock 的构造方法
	- ReentrantLock()：创建一个 ReentrantLock 的实例

### 死锁

- 多个线程互相持有对方所需要的资源，导致这些线程处于等待状态，无法往前执行

## 生产者和消费者

- 是一个十分经典的多线程协作模式，弄懂生产者消费者问题能够让我们对多线程编程理解更加深刻

### 等待和唤醒的方法

- 为了体现生产和消费过程中的等待和唤醒，Java就提供了几个方法供我们使用，这几个方法在 Object 类中
- Object类的等待和唤醒方法：

| 方法名              | 说明                                              |
|------------------|-------------------------------------------------|
| void wait()      | 导致当前线程等待，知道另一个线程调用该对象的notify()方法或者notifyAll()方法 |
| void notify()    | 唤醒正在等待对象监视器的单个线程                                |
| void notifyAll() | 唤醒正在等待对象监视器的所有线程                                |