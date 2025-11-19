package recursions;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {1,2,3,6,8,13,43,75};
		int target = 13;
		int ans = binarySearch(arr,target);
		System.out.println(ans);
	}
	
	static int binarySearch(int[] arr, int target) {
		return helper(arr,target,0,arr.length-1);
	}

	private static int helper(int[] arr, int target, int start, int end) {
		if(start > end) {
			return -1;
		}
		int middle = start + (end - start )/2;
		if(arr[middle] == target) {
			return middle;
		}
		else if(arr[middle] > target) {
			return helper (arr,target,start,middle -1);
		}
		else {
			return helper (arr,target,middle +1,end);
		}

	}
	
	
}
