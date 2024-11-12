package controlStatement;

public class FlourPacker {
	public static void main(String[] args) {
		
	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		
		if(bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		  boolean result = false;
	        int totalBigWeight = bigCount * 5;
	        if (totalBigWeight >= goal) {
	            int remaining = goal % 5;
	            if (smallCount >= remaining) {
	                result = true;
	            }
	        } else {
	            if (smallCount >= goal - totalBigWeight) {
	                result = true;
	            }
	        }
	        return result;
	    }
	}
