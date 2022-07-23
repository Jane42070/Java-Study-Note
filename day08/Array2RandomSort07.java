package day08;

import java.util.Random;

/**
 * Array2RandomSort07
 *
 * @author qilin
 */
public class Array2RandomSort07 {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int x = rand.nextInt(arr.length);
				int y = rand.nextInt(arr[x].length);

				// 交换元素
				int temp = arr[i][j];
				arr[i][j] = arr[x][y];
				arr[x][y] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
		}
	}
}
