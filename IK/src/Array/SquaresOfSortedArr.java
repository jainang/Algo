package Array;

import java.util.Arrays;

public class SquaresOfSortedArr {
	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		
	}
	
	public static int[] squaresOfSortedArr(int[] nums) {
		int[] square = null;
		// generate squares - o(n)
		for(int i=0; i< nums.length; i++) {
			square[i] = nums[i] * nums[i];
		}
		
		// do sorting in the array
		Arrays.sort(square);
		return square;
		
	}
	
	// two pointer approach
	public static int[] squaresOfSortedArrBetter(int[] nums) {
		if(nums == null) {
			return null;
		}
		int[] ans = new int[nums.length];
		int start =0, end = nums.length-1;
		int i = end;
		while(start<=end) {
			int pow1 = nums[start]*nums[start];
			int pow2 = nums[end] * nums[end];
			if(pow1>pow2) {
				ans[i--] = pow1;
				start++;
			} else {
				ans[i--] = pow2;
				end--;
			}
		}
		
		return ans;
		
	}
}
