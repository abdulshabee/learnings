package controlStatement;

public class TeenNumberChecker {
	public static void main(String args[]) {
		
	}
	
	public static boolean hasTeen(int i, int j, int k) {
		if(isTeen(i) || isTeen(j) || isTeen(k)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isTeen(int i) {
		if(i >= 13 && i <= 19) {
			return true;
		}
		return false;
	}
}
