package controlStatement;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println(isPerfectNumber(-1));
	}
	
	public static boolean isPerfectNumber(int n) {
		
		if(n < 1) {
			return false;
		}
		int number = 0;
		for(int i = 1; i < n; i++) {
			if(n % i ==0) {
				number += i;
			}
		}
		if(number == n) {
			return true;
		}
		return false;
	}
}
