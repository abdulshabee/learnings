package controlStatement;

public class MinutesToYearConversion {

	public static void main(String[] args) {
		printYearsAndDays(561600);
	} 
	
	public static void printYearsAndDays(long minutes) {
		if(minutes < 0) {
			System.out.println("Invalid Values");
		}
		long noOfDays = (minutes/60)/24;
		long year = noOfDays/ 365;
		long remainDays = noOfDays % 365;
		
		System.out.println(minutes+" min = "+year+" y and "+remainDays+" d");
	}
}
