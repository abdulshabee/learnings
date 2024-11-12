package controlFlow;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(112));
	}

	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int temp = number;
		int lastDigit;
		while(temp != 0) {
			lastDigit = temp % 10;
			temp = temp / 10;
			reverse = (reverse * 10 ) + lastDigit;
		}
		
		if(reverse == number) {
			return true;
		}else {
			return false;
		}
	}
}
