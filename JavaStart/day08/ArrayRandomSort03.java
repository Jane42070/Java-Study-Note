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
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			int index = rand.nextInt(arr.length);
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
