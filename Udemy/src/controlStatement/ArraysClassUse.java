package controlStatement;

import java.util.Arrays;
import java.util.Random;

public class ArraysClassUse {
	
	public static void main(String[] args) {
		int[] firstArray = getRandomArray(10);
		System.out.println(Arrays.toString(firstArray));
		
		int[] secondArray = getRandomArray(10);
		System.out.println(Arrays.toString(secondArray));
		Arrays.sort(secondArray);
		System.out.println(Arrays.toString(secondArray));
		
		int[] thirdArray = Arrays.copyOf(secondArray, 15);
		System.out.println(Arrays.toString(thirdArray));
		Arrays.fill(thirdArray, 5);
		System.out.println(Arrays.toString(thirdArray));
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
