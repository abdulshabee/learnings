package controlStatement;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivior(81, 153));
	}
	
	public static int getGreatestCommonDivior(int first,int second) {
		
		if(first < 10 || second < 10) {
			return -1;
		}
		int greatestDivisible = 1;
		for(int i =1; i <= (first<second?first:second) ; i++) {
			if (first % i == 0 && second % i == 0) {
				greatestDivisible = i;
			}
		}
		return greatestDivisible;
	}
}
