package day08;

import java.util.Random;

/**
 * ArrayRandomSort03
 * 
 * @author qilin
 */
public class ArrayRandomSort03 {
	public static void main(String[] args) {
		int arr[] = { 12, 45, 98, 73, 60 };
		for (int i = 0; i < arr.length; i++) {
			Random rand = new Random();
			int index = rand.nextInt(arr.length);
			arr[i] = arr[index];
			System.out.println(arr[i]);
		}
	}
}
