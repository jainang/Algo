package Array;

public class Array1 {
	public static void main(String[] args) {
		// find max number of consecutive 1s in the array
		int[] nums = { 1, 1, 0, 0, 1, };
		System.out.println("Max number of consective 1s " + findMaxConsecutiveOnes(nums));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int current = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				current++;
			} else {
				if(current > max) {
					max = current;
				}
				
				if(max >= nums.length/2) {
					return max;
				}
				current = 0;
			}
		}
		return Math.max(max, current);
	}
}
