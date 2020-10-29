package Grokking;

import java.util.Arrays;

public class LargestNumber {
	
	public static void main(String[] args) {
		long[] numbers = {};
		int len = numbers.length;
		System.out.println("Printing the Largest Number " + getLargestNumber(numbers, len));
	}
	
	public static long getLargestNumber(long[] numbers, int len) {
		if(len == 0) {
			return 0;
		}
		
		   Arrays.sort(numbers);
		    return numbers[len- 1];
	}

}
