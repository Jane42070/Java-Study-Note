package day07.BaseTypeClass03;

/**
 * IntegerDemo03
 * 自动
 * 
 * @author qilin
 */
public class IntegerDemo03 {
	public static void main(String[] args) {
		// 装箱：把基本数据类型转换为对应的包装类类型
		// 不对 Integer i = Integer.valueOf(100);
		Integer i = 100;
		System.out.println(i);

		// 拆箱：把包装类类型转换为对应的基本数据类型
		i += 200;
		// i += 200;
		// i = i.intValue() + 100; // 自动拆箱
		System.out.println(i);
	}
}
