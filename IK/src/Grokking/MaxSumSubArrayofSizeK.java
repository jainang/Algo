package Grokking;

public class MaxSumSubArrayofSizeK {
	
	public static void main(String[] agrs) {
		int[] arr = {2, 1, 5, 1, 3, 2};
		int k = 3;
		System.out.println("Pringint the Max Sum sub Array  " + findMaxSumSubArray(k, arr));
		
	}
	
	public static int findMaxSumSubArray(int k, int[] arr) {
		int maxSum = 0;
		int windowSum = 0;
		int windowStart = 0;
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
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
