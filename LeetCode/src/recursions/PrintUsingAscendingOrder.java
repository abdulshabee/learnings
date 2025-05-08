package recursions;

public class PrintUsingAscendingOrder {
	public static void main(String[] args) {
		fun(5);
	}
	
	static void fun(int n) {
		if(n == 0) {
			return;
		}
		// For descending = print before recursion call
		//System.out.println(n);
		fun(n-1);
		// For Ascending = print while removing from recursion call
		System.out.println(n);
	}
}
