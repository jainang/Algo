package Array;

public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = nums1.length;
		int[] nums2 = { 2, 5, 6 };
		int n = nums2.length;
		merge(nums1, nums2, m, n);
		System.out.println("Printing merged array" + nums1);

	}

	public static void merge(int[] nums1, int[] nums2, int m, int n) {
		 int lastIndex = nums1.length - 1;
	        int temp1 = m - 1;
	        int temp2 = n - 1;
	        
	        while (temp1 >= 0 && temp2 >= 0) {
	            if (nums1[temp1] > nums2[temp2]) {
	                nums1[lastIndex--] = nums1[temp1--];
	            } else {
	                nums1[lastIndex--] = nums2[temp2--];
	            }
	        }
	        
	        while (temp1 >= 0) {
	            nums1[lastIndex--] = nums1[temp1--];
	        }
	        
	        while (temp2 >= 0) {
	            nums1[lastIndex--] = nums2[temp2--];
	        }

	}
}
