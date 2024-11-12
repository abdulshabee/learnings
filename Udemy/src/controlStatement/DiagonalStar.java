package controlStatement;

public class DiagonalStar {
/**
 * ***** =  i = 1, j = 5
 * ** ** =  i = 2, j = 4
 * * * * =  1 = 3, j = 3
 * ** ** =  i = 4,  j = 2
 * ***** =  i = 5, j = 1
 * 
 */
	public static void main(String[] args) {
		printSquareStar(5);
	}
	public static void printSquareStar(int num) {
		if(num < 5) {
			System.out.println("Invalid Value");
			return;
		}
		
		for(int i = 1;i<=num ; i++) {
			for(int j = 1;j<=num ; j++) {
				
				if(i == 1 || j == 1 || i == num ||j == num || i == j ||  (i +j) -1 == num) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
