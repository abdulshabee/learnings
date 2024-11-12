package controlStatement;

public class SpeedConverter {
	
	public static void main(String[] args) {
		printConversion(1.25);
	}

	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			return -1;
		}
		double retVal = (kilometersPerHour / 1.609);
		return  Math.round(retVal);
	}
	
	public static void printConversion(double kilometersPerHour) {
		long milesPerHour = toMilesPerHour(kilometersPerHour);
		if(milesPerHour < 0) {
			System.out.println("Invalid Value");
			return;
		}
		
		System.out.println(kilometersPerHour+ " km/h = "+milesPerHour+" mi/h");
		//System.out.printf("%.2f km/h = %d mi/h %n",kilometersPerHour,roundOffValue);
	}
}
