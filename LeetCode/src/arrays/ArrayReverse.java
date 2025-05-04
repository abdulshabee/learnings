package arrays;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String args[]) {
		int[] arr = {1,6,4,3,2};
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void reverseArray(int[] arr) {
		
		int middleIndex = arr.length / 2;
		int lastIndex = arr.length -1;
		
		for(int i = 0; i< middleIndex; i++) {
			int temp = arr[i];
			arr[i] = arr[lastIndex];
			arr[lastIndex] = temp;
			
			lastIndex --;
		}
	}
}
