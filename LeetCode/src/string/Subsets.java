package string;

public class Subsets {
	public static void main(String[] args) {
		String str ="abc";
		
		printAllSubsets("",str);
		
	}
	
	static void printAllSubsets(String p,String up) {
		
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char c = up.charAt(0);
		printAllSubsets(p + c,up.substring(1));
		printAllSubsets(p ,up.substring(1));
	}
	
	static void printAllSubsetItr(String up) {
		String p= "";
		
		
	}
	
	
}
