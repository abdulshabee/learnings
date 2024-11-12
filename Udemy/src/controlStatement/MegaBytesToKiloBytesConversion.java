package controlStatement;

public class MegaBytesToKiloBytesConversion {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(-10);
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
			return;
		}
		
		int megaBytes = kiloBytes / 1024;
		int remianingBytes = kiloBytes % 1024;
		
		System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remianingBytes+" KB");
	}
}
