package day07.BaseTypeClass03;

/**
 * IntegerDemo01
 *
 * 构造方法
 * Integer(int value): 根据 int 值创建 Integer 对象
 * Integer(String s): 根据 String 值创建 Integer 对象
 * 成员方法
 * static Integer valueOf(int i): 返回表示指定的 int 值的 Integer 实例
 * static Integer valueOf(String s): 返回一个保存指定值的 Integer 对象 String
 * 
 * @author qilin
 */
public class IntegerDemo01 {
	public static void main(String[] args) {
		/* Integer i1 = new Integer(100); */
		Integer i1 = Integer.valueOf(100);
		System.out.println(i1);

		/* Integer i2 = new Integer("100"); */
		Integer i2 = Integer.valueOf("100");
		System.out.println(i2);
	}
}
