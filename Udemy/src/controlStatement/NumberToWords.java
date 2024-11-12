package controlStatement;

public class NumberToWords {
	public static void main(String[] args) {
		numberToWords(200);
		System.out.println(getDigitCount(0));
	}
	
	public static void numberToWords(int reversedNum) {
		if(reversedNum < 0) {
			System.out.println("Invalid Value");
			return;
		}
		if(reversedNum == 0) {
			System.out.println("Zero");
			return;
		}
		int singleDigit ;
		int OrginalDigitCount = getDigitCount(reversedNum);
		int num = reverse(reversedNum);
		int reversedDigitCount = getDigitCount(num);
		
		while(num > 0) {
			singleDigit = num % 10;
			num /= 10;
			
			switch(singleDigit) {
			case 1 -> System.out.println("One");
			case 2 -> System.out.println("Two");
			case 3 -> System.out.println("Three");
			case 4 -> System.out.println("Four");
			case 5 -> System.out.println("Five");
			case 6 -> System.out.println("Six");
			case 7 -> System.out.println("Seven");
			case 8 -> System.out.println("Eight");
			case 9 -> System.out.println("Nine");
			case 0 -> System.out.println("Zero");
			}
		}
		if (OrginalDigitCount != reversedDigitCount) {
			int difference = OrginalDigitCount - reversedDigitCount;
			while (difference != 0) {
				System.out.println("Zero");
				difference--;
			}
		}
	}
	
	public static int reverse(int num) {
		if(num < 0) {
			return -1;
		}
		int reverse = 0;
		int lastDigit = 0;
		while(num > 0) {
			lastDigit = num % 10 ;
			num /= 10;
			reverse = (reverse * 10) + lastDigit;
		}
		return reverse;
	}

	public static int getDigitCount(int num) {
		if(num < 0) {
			return -1;
		}
		if(num == 0) {
			return 1;
		}
		int count = 0;
		while(num > 0) {
			num /= 10;
			count ++;
		}
		return count;
	}
}
