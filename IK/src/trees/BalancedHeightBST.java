package trees;

public class BalancedHeightBST {
	
	Node root;
	
	public static void main(String[] agrs) {
		
		
		
	}
	
	//Top down 
	public boolean isBalanced(Node root) {
		if(root == null) {
			return true;
		}
		
		int left = height(root.left);
		int right = height(root.right);
		
		if(Math.abs(left - right) > 1) {
			return false;
		}
		
		return isBalanced(root.left) && isBalanced(root.right);
	}

	private int height(Node root) {
		if(root == null) {
			return 0;
		}
		
		return 1+ Math.max(height(root.left) , height(root.right));
		
	}

}
