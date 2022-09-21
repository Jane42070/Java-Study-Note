# String
- String 类在 java.lang 包下，所以使用的时候不需要写包
- String 类代表字符串，Java 程序中的所有字符串文字（例如"abc"）都被实现为此类的实例
- 也就是说：Java 程序中所有双引号字符串都是 String 类的对象
- 字符串不可变，它们的值在创建后不能被更改

## 创建字符串对象区别对比
- 问题：构造方法能创建对象，双引号也能创建字符串对象，有什么区别吗？
- 注意：用 == 号做比较
	- 基本数据类型：比较的是具体的值
	- 引用数据类型：比较地址值
- 以""方式给出的字符串，只要字符序列相同（顺序和大小写）,无论在程序代码中出现几次，JVM 都只会建立一个 String 对象，并在字符串常量池中维护
	```java
	String s1 = "abc";
	String s2 = "abc";
	```
- 字符串常量池：当使用双引号创建对象的时候，系统会检查该字符串是否在字符串常量中存在
	- 不存在：创建
	- 存在：不会重新创建，而是直接复用
- 通过 new 创建的字符串对象，每一次 new 都会申请一个内存空间，虽然内容相同，但是地址值不同
	```java
	char[] chs = {'a', 'b', 'c'};
	String s1 = new String(chs);
	String s2 = new String(chs);
	```
	- 上面的代码中，JVM 首先会创建一个字符数组，然后每一次 new 的时候都会有一个新的地址
- 双引号创建的字符串对象，在字符串常量池中存储，通过构造方法创建的字符串对象，在堆内存中存储

## String 字符串的特点
- Java 程序中所有双引号字符串都是 String 类的对象
- 字符串不可变，它们的值在创建后不能被更改
- 虽然 String 的值不能被改变，但是他们可以被共享

## 字符串比较
- equals()

# StringBuilder
- StringBuilder 是一个可变的字符串类，我们可以把它看成是一个容器
- 作用：提高字符串的操作效率
## StringBuilder 的常用方法
- public StringBuilder append（任意类型）: 添加数据，并返回对象本身
- public StringBuilder reverse(): 返回相反的字符序列
- public int length(): 返回长度（字符出现的个数）
- public String toString(): 通过 toString()就可以把 StringBuilder 转换为 String
## String 和 StringBuilder 的区别
- String: 内容是不可改变的
- StringBuilder: 内容是可变的
## StringBuilder 和 String 相互转化
- StringBuilder 转换为 String
	- public String toString(): 通过 toString 可以把 StringBuilder 转化为 String
- String 转换为 StringBuilder
	- public StringBuilder(String s): 通过构造方法可以把 String 转化为 StringBuilder
