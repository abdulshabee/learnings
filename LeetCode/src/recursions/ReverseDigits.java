package recursions;

public class ReverseDigits {
	static int  sum  = 0;
	public static void main(String[] args) {
		reverseDigits(12345);
		System.out.println(sum);
	}
	
	static void reverseDigits(int n) {
		if(n == 0) {
			return ;
		}
		int rem = n % 10 ;
		sum = sum * 10 + rem;
		 reverseDigits(n/10);
	}
}
