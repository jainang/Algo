package Strings;

import java.util.HashMap;

public class PalidromePremutations {
	public static void main(String[] args) {
		String str = "tactcoa";
		System.out.println("is Palindorme Premutation " + isPalidromePermutation(str) );
	}
	
	// using int array
	public static boolean palidromePremutation(String str) {
		int[] charCounts = new int[128];
		for(int i=0; i< str.length(); i++){
			charCounts[str.charAt(i)]++;
		}
		
		int count =0;
		for(int i=0; i<128; i++) {
			count +=charCounts[i]%2;
		}
		return count <=1;
	}
	
	// using hashmap
	
	public static boolean isPalidromePermutation(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i< str.length(); i++) {
			map.put( str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1 );
		}
		
		int count =0;
		for(char key : map.keySet()) {
			count += map.get(key) %2;
		}
		
		return count <=1;
	}
}
