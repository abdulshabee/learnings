package controlFlow;

public class FirstAndLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(249));
	}
	public static int sumFirstAndLastDigit(int number) {
		if(number < 0) {
			return -1;
		}
		int lastNum = number % 10; 
		int firstNum = 0;
		if(number == 0) {
			return 0;
		}
		while (number > 0) {
		firstNum = number % 10;
		number = number / 10;
		}
		
		return lastNum + firstNum ;
	}
}
