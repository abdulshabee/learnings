package recursions;

public class DigitSum {
	public static void main(String[] args) {
		System.out.println(digitSum(1234));
	}
	
	static int digitSum(int i) {
		if(i <= 1) {
			return i;
		}
		
		return i % 10 + digitSum(i/10);
	}
}
