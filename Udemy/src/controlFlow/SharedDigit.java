package controlFlow;

public class SharedDigit {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 13));
	}
	public static boolean hasSharedDigit(int num1, int num2) {
		if(num1 >= 100 || num2 >= 100 || num1 <= 10 || num2 <= 10 ) {
			return false;
		}
		int firstDigit = 0; 
		int secondDigit = 0;
		while (num1 > 0 ) {
			firstDigit = num1 % 10;
			num1 /= 10;
			int temp = num2;
			while (temp > 0) {
				secondDigit = temp % 10;
				temp /= 10;
				
			if(firstDigit == secondDigit) {
				return true;
			}
			}
		}
		return false;
	}
}
