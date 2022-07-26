package day08;

import java.util.Scanner;

/**
 * ArrayInputCase05
 * 需求：定义一个可以存储 5 个元素的 int 数组，数据来源于键盘录入，最后遍历数组，输出在控制台
 * 数组长度可知，元素未知，采用动态初始化
 *
 * @author qilin
 */
public class ArrayInputCase05 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个元素：");
			arr[i] = sc.nextInt();
		}
		sc.close();

		RecurseArray(arr);

		/* for (int i = 0; i < arr.length; i++) { */
		/* System.out.println(arr[i]); */
		/* } */
	}

	public static void RecurseArray(int arr[]) {
		System.out.println("数组元素:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
