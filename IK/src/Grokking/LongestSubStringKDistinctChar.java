package Grokking;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringKDistinctChar {
   public static void main(String[] args) {
	   String s = "araaci";
	   int k=2;
	   
   }
   
   public static int longestSubString(int k, String s) {
	   if (s== null || s.length() == 0 || s.length()<k) {
		   throw new IllegalArgumentException();
	   }
		int maxLen = 0;
		int windowStart = 0;
		Map<Character, Integer> charFreqMap = new HashMap<>();
		
		for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
			windowSum += arr[windowEnd]; // add the next element
			// slide the window, we don't need to slide if we've not hit the required window
			// size of 'k'
			if (windowEnd >= k - 1) {
				maxSum = Math.max(maxSum, windowSum); // calculate the average
				windowSum -= arr[windowStart]; // subtract the element going out
				windowStart++; // slide the window ahead
			}
		}
		return maxSum;
	}
   
}
