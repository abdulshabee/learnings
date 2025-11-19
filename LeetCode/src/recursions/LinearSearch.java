package recursions;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,8,9,5};
		System.out.println(linearSearch(arr,1));
	}

	public static int linearSearch(int arr[],int target) {
		int index =  0;
		return helper(arr, index, target);
		
		
	}
	
	static int helper(int[] arr, int index, int target) {
		if(index > arr.length - 1) {
			return -1;
		}
		

		return arr[index] == target? index :helper(arr,index +1 ,target);
	}
}
