package day08;

/**
 * Array2Demo06
 * 二维数组静态初始化
 *
 * @author qilin
 */
public class Array2Demo06 {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		System.out.println(arr);

		System.out.println(arr[0]);

		// 如何获取到数据 1,2,3 呢？
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);

		// 二维数组遍历
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}
	}
}
