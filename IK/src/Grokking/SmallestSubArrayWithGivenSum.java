package Grokking;

public class SmallestSubArrayWithGivenSum {
	
	public static void main(String[] agrs) {
		int[] arr = {2, 1, 5, 2, 3, 2};
		int s = 7;
		System.out.println("Printing the Smallest Sum sub Array  " + findSmallestSumSubArray(s, arr));
		
	}
	
	public static int findSmallestSumSubArray(int s, int[] arr) {
		int minSum = Integer.MIN_VALUE;
		int windowSum = 0;
		int windowStart = 0;
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			windowSum += arr[windowEnd]; // add the next element
			// slide the window, we don't need to slide if we've not hit the required window
			// size of 'k'
			if (windowSum >= s) {
				minSum = Math.min(minSum, windowEnd - windowSum +1); // calculate the average
				windowSum -= arr[windowStart]; // subtract the element going out
				windowStart++; // slide the window ahead
			}
		}
		return minSum == Integer.MAX_VALUE ? 0 : minSum;
	}

}
