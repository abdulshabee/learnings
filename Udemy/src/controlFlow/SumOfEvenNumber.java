package controlFlow;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(1234567));
	}
	public static int getEvenDigitSum(int number) {
		if(number < 0) {
			return -1;
		}
		
		int totalSumEven = 0;
		int lastDigit = 0;
		while (number > 0) {
			lastDigit = number % 10;
			number = number / 10 ;
			
			if(lastDigit % 2 == 0) {
				totalSumEven = totalSumEven + lastDigit;
			}
		}
		
		return totalSumEven;
	}
}
