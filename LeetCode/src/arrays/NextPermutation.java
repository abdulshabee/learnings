package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
	public static void main(String[] args) {
		int[] arr = {2, 4, 1, 7, 5, 0};  
		nextPermutation(arr);
	}
	
	public static void nextPermutation(int[] arr) {
		
		List<int[]> res = new ArrayList<int[]>();
		permutation(res,arr,0);
		Collections.sort(res,Arrays::compare);
	}

		private static void permutation(List<int[]> res, int[] arr, int idx) {
			
			//Base case idx reaches the end of the array
			if(idx == arr.length -1) {
				res.add(arr.clone());
				return;
			}
			
			//Permutation made by swapping each elements
			//starting from index 'idx'
			//for
			
		}
}
