package arrays;

public class SecondLargestNumber {

	public static void main(String args[]) {
		int arr[] = {12, 35, 1, 10, 34, 1};
		System.out.println(secondLargestNumber(arr));
	}
	public static int secondLargestNumber(int arr[]) {
		
		if(arr.length < 1) {
			return -1;
		}
		int largestNumber = -1;
		int secondLargestNumber =-1;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > largestNumber) {
				secondLargestNumber = largestNumber;
				largestNumber = arr[i];
			}
			else if (arr[i] < largestNumber && arr[i] > secondLargestNumber) {
				secondLargestNumber = arr[i];
			}
		}
		
		return secondLargestNumber;
	}
}
