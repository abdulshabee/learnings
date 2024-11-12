package controlStatement;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {

	public static void main(String args[]) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
		DecimalFormat fr =  new DecimalFormat("#.###");
		fr.setRoundingMode(RoundingMode.DOWN);
		
		String num1Value = fr.format(num1);
		String num2Value = fr.format(num2);
		System.out.println(num1Value+"  "+num2Value);
		if(num1Value.equals(num2Value)) {
			return true;
		}
		
		return false;
	}
}
