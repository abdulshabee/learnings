package controlFlow;

public class FactorPrinter {

	public static void printFactor(int number) {
		if(number < 1) {
			System.out.println("Invalid Value");
			return;
		}
		for (int i = 0; i <= number; i++ ) {
			if(number % i == 0) {
				System.out.println(i);
			}
		}
	}
}
