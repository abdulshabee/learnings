package arrays;

import java.util.Arrays;

public class RotatingTheArray {
	public static void main (String[] args) {
		int[] arr = {1,2,3,4,5,6};
		reverseArray(arr,2);
		System.out.println(Arrays.toString(arr));
		/**
		 * reverse start 0 -> d -1 => 2 1 3 4 5 6
		 * 
		 * reverse remaining elements d - > n => 2 1 6 5 4 3
		 * 
		 * reverse the whole array 3 4 5 6 1 2 
		 */
	}
	
	public static void reverseArray(int[] arr, int d) {
		int n = arr.length;
		
		d = d % n;
		
		reverse(arr,0 ,d-1);
		reverse(arr,d ,n-1);
		reverse(arr,0 ,n-1);
	}
	
	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] =  arr[end];
			arr[end] = temp;
			start ++;
			end --;
		}
	}
}
