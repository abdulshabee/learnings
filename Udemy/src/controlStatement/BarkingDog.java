package controlStatement;

public class BarkingDog {
	public static void main(String[] args) {
		System.out.println(shouldWakeUp(true, 23));
		
	}
	
	public static boolean shouldWakeUp(boolean barking, int hours) {
		
		if(!barking) {
			return false;
		}
		
		if ((hours < 8 || hours > 22) && (hours >= 0 && hours <= 23)) {
			return true;
		}
		
		return false;
	}
}
