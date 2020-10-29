package Array;

public class NumsWithEven {
	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		System.out.println(" Ans " + findNumbers(nums));
	}

	public static int findNumbers(int[] nums) {

	    int n = nums.length;
	    if(n==0)
	        return 0;
	    
	    int res_count=0;
	    for(int i=0;i<n;i++){
	        String num = String.valueOf(nums[i]);
	        if(num.length()%2 ==0)
	            res_count++;
	    }
	    return res_count;
	}

}
