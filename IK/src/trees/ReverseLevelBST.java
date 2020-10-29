package trees;

public class ReverseLevelBST {

	public static void main(String[] agrs) {
		Node x = new Node(15);
		x.left = new Node(10);
		x.right = new Node(20);
		x.left.left = new Node(8);
		x.left.right = new Node(12);
		x.right.left = new Node(16);
		x.right.right = new Node(25);
		
		reverseLevelOrderTraversal(x, height(x));
	}
	
	// recursive approach
	private static int height(Node x) {
		if(x==null) {
			return 0;
		}
		return 1 + Math.max(height(x.left), height(x.right));
	}

	public static void reverseLevelOrderTraversal(Node x, int level) {
		
		if (level == 1) {
			System.out.println(x.data);
		}

		reverseLevelOrderTraversal(x.left, level);
		System.out.println(x.left.data);
	    reverseLevelOrderTraversal(x.right, level);
		System.out.println(x.right.data);
		level--;
		
		
	}
}
