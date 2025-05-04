package arrays;

import java.util.Arrays;

public class ZeroAtLast {

	public static void main(String args[]) {
		int[] arr = {1,2,0,0,3,4,5,0,0};
		pushZeroAtLast(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * Native Approach - two traverse
	 * @param arr
	 */
	public static void pushZeroAtLastOld(int arr[]) {
		
		int count = 0;
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			
			if(arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		
		while (count < n) {
			arr[count++] = 0;
		}
	}
	
	public static void pushZeroAtLast(int arr[]) {

		int count = 0;
		int n = arr.length;

		for(int i = 0; i < n; i++) {

			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				
				count ++;
			}
		}
	}
}
