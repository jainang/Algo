package trees;

public class MaxBinaryTree {
	
public static void main(String[] args) {
		int[] nums = {3, 2, 1, 6, 0, 5};
		MaxBinaryTree tree = new MaxBinaryTree();
		tree.maxBinaryTree(nums);
		
	}
	
	public Node maxBinaryTree(int[] nums) {
		if(nums == null) { // base case
			return null;
		}
		return helper(nums, 0, nums.length);
	}

	private Node helper(int[] nums, int L, int R) {
		// base case 
		if (L == R) {
			return null;
		}
		
		int max = L;
		for(int i = L ; i<R;i++) {
			if(nums[max] < nums[i]) {
				max = i;
			}
		}
		
		Node root = new Node(nums[max]);
		root.left = helper(nums, L, max);
		root.right = helper(nums, max+1, R);
		
		return root;
	}
	
	

}
