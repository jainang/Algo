package trees;

public class PathSumBT {
	
	public static void main(String[] args) {
		Node x = new Node(5);
		x.left = new Node(4);
		x.right = new Node(8);
		x.right.left = new Node(13);
		x.right.right = new Node(4);
		x.right.right.right = new Node(1);
		x.left.left = new Node(11);
		x.left.left.left = new Node(7);
		x.left.left.right = new Node(2);
		System.out.println("Is Path Sum " + isPathSum(x, 22));
	}

	private static boolean isPathSum(Node x, int sum) {
		if(x == null) { // base condition
			return sum==0;
		}
		
		return isPathSum(x.left, sum-x.data) || isPathSum(x.right, sum-x.data);
		
	    
	}

}
