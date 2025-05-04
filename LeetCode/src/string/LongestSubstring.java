package string;

import java.util.HashMap;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcab"));
	}
	
	public static int lengthOfLongestSubstring(String s) {

		if (s == null || s.isEmpty()) return 0;
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();

		int maxLength = 0;
		int start = 0;
		int maxStart = 0;

		for(int i = 0;i < s.length(); i++) {

			char currentChar = s.charAt(i);

			if(map.containsKey(currentChar) && map.get(currentChar) >= start) {
				start = map.get(currentChar) + 1;

			}
			map.put(currentChar, i);
			if(i - start + 1 > maxLength) {
				maxLength = i =start + 1;
				maxStart = start;
			}
		}
		// Function is not yet completed..
		return -1;
	}
}