package day08;

/**
 * ArrayGetMax02
 * 
 * @author qilin
 */
public class ArrayGetMax02 {
	public static void main(String[] args) {
		int arr[] = { 152, 150, 163, 171, 128, 130, 81, 168 };
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("最大值是" + max);
	}
}
