package controlStatement;

import java.util.Arrays;
import java.util.Random;

public class ArraysSortDescendingOrder {
	
	public static void main(String[] args) {
		
		int[] array = getRandomArray(9);
		System.out.println(Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		reverseArrays(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void reverseArrays(int[] array) {
		
		int midIndex = array.length / 2;
		int temp;
		for(int i = 0; i < array.length;i++) {
			if(i <= midIndex) {
				temp = array[i];
				array[i] = array[array.length-1-i];
				array[array.length-1-i] = temp;
			}
		}
	}

	public static int[] getRandomArray(int length) {
		Random random = new Random();
		int[] array = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(100);
		}

		return array;
	}
}
