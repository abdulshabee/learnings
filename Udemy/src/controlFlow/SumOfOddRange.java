package controlFlow;

public class SumOfOddRange {

	public static void main(String[] args) {
		System.out.println(sumOdd(100,1000));
	}
	
	public static boolean isOdd(int number) {
		if(number <= 0 && number % 2 == 0) {
			return false;
		}
		return true;
	}
	
	public static int sumOdd(int start, int end) {
		if(end >= start && start > 0) {
			int sumOdd =0;
			for(int i = start; i <= end; i++) {
				if(isOdd(i)) {
					sumOdd +=i;
				}
			}
			return sumOdd;
		}
		else {
			return -1;
		}
}
}
