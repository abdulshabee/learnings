package arrays;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=array
/**
 * Given an array of integers, return indices of the two numbers such that they add
up to a specific target.
You may assume that each input would have exactly one solution, and you may not
use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {

	public static void main(String[] args) {
		
	}
	
	public int[] twoSum(int[] nums, int target) {
		/* First Approach as Brute Force
		 * int[] retVal = new int[2];
		 * 
		 * for(int i = 0; i < nums.length; i ++) { for (int j= i+1; j < nums.length; j
		 * ++) { if(target == nums[i]+ nums[j]) { retVal[0] = i; retVal[1] = j; return
		 * retVal; } } }
		 * 
		 * return retVal;
		 */
		//Second Approach as One Pass Hash Table
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			map.put(complement, i);
		}
		return new int[] {};
	}
}
